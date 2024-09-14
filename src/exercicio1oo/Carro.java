package exercicio1oo;



    public class Carro {
        public String modelo;
        public float velocidade;

        public Carro(String modelo) {
            this.modelo = modelo;
            this.velocidade = 0;
        }

        public static void main(String[] args) {
            Carro carro = new Carro("Fusca");
            carro.acelerar();
            carro.acelerar();
            carro.frear();

            System.out.println("Velocidade atual: " + carro.exibirVelocidade() + " km/h");
        }

        public void acelerar() {
            velocidade += 10;
        }

        public void frear() {
            if (velocidade >= 10) {
                velocidade -= 10;
            } else {
                velocidade = 0;
            }
        }

        public float exibirVelocidade() {
            return velocidade;
        }
    }
