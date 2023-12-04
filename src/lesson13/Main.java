package lesson13;

public class Main {
    public static void main(String[] args) {
        double[][] numsForA =
                {{3, 6, 4, 8},
                        {1, 1, 7, 3},
                        {8, 7, 9, 9}};
        Matrix a = new Matrix(numsForA);
        System.out.println("колличество строк: " + a.getRows());
        System.out.println("колличество столбцов: " + a.getColumns());
        System.out.println("Элемент в индексах [0,0]: " + a.getValueAt(0, 0));
        ;
        a.setValueAt(0, 0, 9);
        System.out.println("Переприсвоили элемент с индексами [0,0] на: " + a.getValueAt(0, 0));

        double[][] numsForB =
                        {{5, 7, 1, 6},
                        {9, 2, 3, 8},
                        {3, 2, 5, 5}};
        Matrix b = new Matrix(numsForB);

        System.out.println();
        System.out.println("Матрица а:");
        a.printToConsole();
        System.out.println("Матрица б:");
        b.printToConsole();

        IMatrix resultAdd = a.add(b);
        System.out.println("Сумма матриц а+б:");
        resultAdd.printToConsole();

        IMatrix resultSub = a.sub(b);
        System.out.println("Разность матриц а-б:");
        resultSub.printToConsole();

        IMatrix resultMul1 = a.mul(3);
        System.out.println("Умножили матрицу а на число 3: ");
        resultMul1.printToConsole();

        IMatrix c = a.transpose();
        System.out.println("Матрица с (транспорированнная а): ");
        c.printToConsole();

        IMatrix resultMul2 = a.mul(c);
        System.out.println("Умножили матрицу а на с: ");
        resultMul2.printToConsole();
        System.out.println("Детерминант данной матрицы: " + resultMul2.determinant());
        System.out.println();

        resultMul2.fillMatrix(7.7);
        System.out.println("заполнили числом 7.7: ");
        resultMul2.printToConsole();

        System.out.println("Данная матрица квадратная?: " + resultMul2.isSquareMatrix());
        System.out.println("Матрица а квадратная?: " + a.isSquareMatrix());

        double[][] numsForD =
                        {{1, 0, 0, 0},
                        {0, 1, 0, 0},
                        {0, 0, 1, 0},
                        {0, 0, 0, 1}};
        Matrix d = new Matrix(numsForD);
        System.out.println();
        System.out.println("Матрица d:");
        d.printToConsole();

        System.out.println("Данная матрица единичная?: " + d.isIdentityMatrix());
        System.out.println("Матрица а единичная?: " + a.isIdentityMatrix());

        double[][] numsForE =
                        {{0, 0, 0, 0},
                        {0, 0, 0, 0},
                        {0, 0, 0, 0},
                        {0, 0, 0, 0}};
        Matrix e = new Matrix(numsForE);
        System.out.println();
        System.out.println("Матрица e:");
        e.printToConsole();

        System.out.println("Данная матрица нулевая?: " + e.isNullMatrix());
        System.out.println("Матрица d нулевая?: " + d.isNullMatrix());



    }
}
