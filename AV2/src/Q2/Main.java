package Q2;

public static void main(String args[]) {
        AVLTree t = new AVLTree();
        Node root = null;
        //Exemplo de insert
//        root= t.insert(root, i);
        int menu = 0;
        int num = 0;
        int elem[] = {50, 13, 5, 17 , 9, 8, 10, 12, 55, 70};
        Scanner ler = new Scanner(System.in);

        while (menu != 4) {
            System.out.println("============= ARVORE =============");
            System.out.println("1 - Inserir");
            System.out.println("2 - Excluir");
            System.out.println("3 - Pré-ordem");
            System.out.println("4 - Sair");
            System.out.println("==============================================");
            System.out.println("==Por gentileza escolha uma opção de [1-4]: ==");
            System.out.println("==============================================");
            menu = ler.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("============= SUCESSO! =============\n");
                    for (int i = 0; i < elem.length; i++) {
                        num = elem[i];
                        root = t.insert(root, num);
                    }
                    break;
                case 2:
                    System.out.println("============= Excluir =============");
                    System.out.println("Escreva o elemento que deseja excluir: ");
                    num = ler.nextInt();
                    root = t.deleteNode(root, num);
                    break;
                case 3:
                    System.out.println("============= Pré-ordem =============");
                    t.preOrder(root);
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("SISTEMA ENCERRADO!");

                    break;
                default:
                    System.out.println("Opção Invalida!");
                    break;

            }
        }

    }
}
