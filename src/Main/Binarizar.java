package Main;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Binarizar {
    public static void main(String[] args) {
        try {
            // Carrega a imagem
            File arquivoImagem = new File("C:\\Users\\princ\\OneDrive\\Documentos\\4º Período - Ccompt\\P. de " +
                    "imagens e V. computacional\\Exercicio de Revisao e Alinhamento de Conteudo\\src\\images\\imagem4.jpg");
            BufferedImage imagem = ImageIO.read(arquivoImagem);

            int limiar = 128;

            // Obtém a largura(width) e a altura da imagem(height)
            int largura = imagem.getWidth();
            int altura = imagem.getHeight();

            // Percorre cada pixel da imagem
            for (int y = 0; y < altura; y++) {
                for (int x = 0; x < largura; x++) {
                    // Obtém o valor RGB do pixel
                    int rgb = imagem.getRGB(x, y);
                    Color cor = new Color(rgb);

                    int luz = cor.getRed() + cor.getGreen() + cor.getBlue() / 3;

                    if (luz < limiar){
                        imagem.setRGB(x, y, Color.BLACK.getRGB());
                    }
                    else {
                        imagem.setRGB(x, y, Color.WHITE.getRGB());
                    }
                }
            }

            // Salva a nova imagem
            File output = new File("imagem4inverso_modificada.jpg");
            ImageIO.write(imagem, "jpg", output);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
