    public class Aluno {
        private String nome;
        private int idade;
        private double n1, n2, n3, n4;


        public String getNome() {
            return nome;
        }


        public void setNome(String nome) {
            this.nome = nome;
        }


        public int getIdade() {
            return idade;
        }


        public void setIdade(int idade) {
            this.idade = idade;
        }


        public double getN1() {
            return n1;
        }


        public void setN1(double n1) {
            this.n1 = n1;
        }


        public double getN2() {
            return n2;
        }


        public void setN2(double n2) {
            this.n2 = n2;
        }


        public double getN3() {
            return n3;
        }


        public void setN3(double n3) {
            this.n3 = n3;
        }


        public double getN4() {
            return n4;
        }


        public void setN4(double n4) {
            this.n4 = n4;
        }


        public double calcularMedia() {
            return (n1 + n2 + n3 + n4) / 4;
        }


        public void imprimirSituacao() {
            double media = calcularMedia();
            if (media >= 7) {
                System.out.println(nome + " está aprovado!");
            } else {
                System.out.println(nome + " está reprovado!");
            }
        }
    }


