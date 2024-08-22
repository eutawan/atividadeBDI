package Main;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class removerCor {
    public static void main(String[] args) {
        try {
            // Carrega a imagem
            File arquivoImagem = new File("C:\\Users\\princ\\OneDrive\\Documentos\\4º Período - Ccompt\\P. de " +
                    "imagens e V. computacional\\Exercicio de Revisao e Alinhamento de Conteudo\\9221341-tela-verde-8k-" +
                    "ultra-hd-plus-gratis-foto.jpg");
            BufferedImage imagem = ImageIO.read(arquivoImagem);

            Color corRemover = new Color(0, 255, 0); //verde
            int limiar = 30;

            // Obtém a largura(width) e a altura da imagem(height)
            int largura = imagem.getWidth();
            int altura = imagem.getHeight();

            // Percorre cada pixel da imagem
            for (int y = 0; y < altura; y++) {
                for (int x = 0; x < largura; x++) {
                    // Obtém o valor RGB do pixel
                    int rgb = imagem.getRGB(x, y);
                    Color cor = new Color(rgb);

                    // Obtém os componentes de cor
                    int diferenteR = Math.abs(cor.getRed() - corRemover.getRed());
                    int diferenteG = Math.abs(cor.getGreen() - corRemover.getGreen());
                    int diferenteB = Math.abs(cor.getBlue() - corRemover.getBlue());

                    if (diferenteR < limiar && diferenteG < limiar && diferenteB < limiar){
                        imagem.setRGB(x, y, new Color(0, 0, 0, 0).getRGB());
                    }
                }
            }

            // Salva a nova imagem
            File output = new File("imagem_modificada.jpg");
            ImageIO.write(imagem, "jpg", output);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

