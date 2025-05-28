package lox;

abstract class Expr {

    static class Binary extends Expr {
        final Expr left;
        final Token operand;
        final Expr right;

        Binary(Expr left, Token operand, Expr right){
            this.left = left;
            this.operand = operand;
            this.right = right;
        }
    }
}
