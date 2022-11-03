    class MultiInherit{
        void msg(){System.out.println("Hello");}
    }
    class B{
        void msg(){System.out.println("Welcome");}
    }
    class C extends MultiInherit,B{//suppose if it were

        void msg(){System.out.println("Welcome");}

        public static void main(String args[]){
            C obj=new C();
            obj.msg();//Now which msg() method would be invoked?
        }
    }
}
