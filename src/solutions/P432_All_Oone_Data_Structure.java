package solutions;

import java.util.HashMap;
import java.util.Map;

public class P432_All_Oone_Data_Structure {
    public class AllOne {
        private final Map<String, Node> map;
        private Node head;
        private Node tail;

        public AllOne() {
            head = null;
            tail = null;
            map = new HashMap<>();
        }

        public void inc(String key) {
            if (map.containsKey(key)) {
                Node node = map.get(key);
                node.count++;
                moveUp(node);
            } else {
                Node node = new Node(key, 1);
                add(node);
                map.put(key, node);
            }
        }

        public void dec(String key) {
            Node node = map.get(key);
            if (node.count == 1) {
                map.remove(key);
                remove(node);
            } else {
                node.count--;
                moveDown(node);
            }
        }

        public String getMaxKey() {
            if (map.isEmpty())
                return "";
            return tail.key;
        }

        public String getMinKey() {
            if (map.isEmpty())
                return "";
            return head.key;
        }

        void add(Node n) {
            assert n.count == 1;
            if (head == null) {
                head = n;
                tail = n;
            } else {
                n.next = head;
                head.pre = n;
                head = n;
            }
        }

        void remove(Node n) {
            if (n == head && n == tail) {
                head = null;
                tail = null;
                return;
            }
            Node p = head;
            while (p != n) {
                p = p.next;
            }
            if (p == head) {
                head = p.next;
                head.pre = null;
            } else {
                if (p == tail) {
                    tail = tail.pre;
                    tail.next = null;
                } else {
                    p.pre.next = p.next;
                    p.next.pre = p.pre;
                }
            }
        }

        void moveUp(Node n) {
            Node p = n.next;
            while (p != null && p.count < n.count) {
                p = p.next;
            }
            if (p != n.next) {
                if (n == head) {
                    head = n.next;
                } else {
                    n.pre.next = n.next;
                }
                n.next.pre = n.pre;

                n.next = p;
                if (p == null) {
                    n.pre = tail;
                    tail.next = n;
                    tail = n;
                } else {
                    n.pre = p.pre;
                    p.pre.next = n;
                    p.pre = n;
                }
            }
        }

        void moveDown(Node n) {
            Node p = n.pre;
            while (p != null && p.count > n.count) {
                p = p.pre;
            }
            if (p != n.pre) {
                if (n == tail) {
                    tail = n.pre;
                } else {
                    n.next.pre = n.pre;
                }
                n.pre.next = n.next;

                n.pre = p;
                if (p == null) {
                    n.next = head;
                    head.pre = n;
                    head = n;
                } else {
                    n.next = p.next;
                    p.next.pre = n;
                    p.next = n;
                }
            }
        }

        static class Node {
            String key;
            int count;
            Node pre;
            Node next;

            public Node(String key, int count) {
                this.key = key;
                this.count = count;
            }
        }
    }
}
