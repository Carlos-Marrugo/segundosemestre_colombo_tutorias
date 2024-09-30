ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        
        long inicioArrayList = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);  
        }
        long finArrayList = System.currentTimeMillis();
        System.out.println("Tiempo de insercion en ArrayList: " + (finArrayList - inicioArrayList) + " ms");

        long inicioLinkedList = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
        long finLinkedList = System.currentTimeMillis();
        System.out.println("Tiempo de insercion en LinkedList: " + (finLinkedList - inicioLinkedList) + " ms");
