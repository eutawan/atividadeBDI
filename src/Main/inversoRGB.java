package Main;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class inversoRGB {
    public static void main(String[] args) {
        try {
            // Carrega a imagem
            File arquivoImagem = new File("C:\\Users\\princ\\OneDrive\\Documentos\\4º Período - Ccompt\\P. de " +
                    "imagens e V. computacional\\Exercicio de Revisao e Alinhamento de Conteudo\\src\\cores-rgb.jpg");
            BufferedImage imagem = ImageIO.read(arquivoImagem);

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
                    int red = cor.getRed();
                    int green = cor.getGreen();
                    int blue = cor.getBlue();

                    //Inverter as cores
                    int redInverso = 255 - red;
                    int greenInverso = 255 - green;
                    int blueInverso = 255 - blue;

                    Color corInvertida = new Color(redInverso, greenInverso, blueInverso);

                    imagem.setRGB(x, y, corInvertida.getRGB());
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
