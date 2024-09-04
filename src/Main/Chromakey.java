package Main;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Chromakey {
    public static void main(String[] args) {
        try {
            // Carrega a imagem
            File arquivoImagem = new File("C:\\Users\\princ\\OneDrive\\Documentos\\4º Período - Ccompt\\P. de " +
                    "imagens e V. computacional\\Exercicio de Revisao e Alinhamento de Conteudo\\9221341-tela-verde-8k-" +
                    "ultra-hd-plus-gratis-foto.jpg");

            File arquivoNovo = new File("C:\\Users\\princ\\OneDrive\\Documentos\\4º Período - Ccompt\\P. de" +
                    " imagens e V. computacional\\Exercicio de Revisao e Alinhamento de Conteudo\\" +
                    "anime-city-hd-zt-1280x720.jpg");

            BufferedImage imagem = ImageIO.read(arquivoImagem);
            BufferedImage imagemFundo = ImageIO.read(arquivoNovo);

            int largura = imagem.getWidth();
            int altura = imagem.getHeight();

            BufferedImage imagemNova = new BufferedImage(largura, altura, BufferedImage.TYPE_4BYTE_ABGR);

            Color corRemover = new Color(0, 255, 0); //verde

            // Obtém a largura(width) e a altura da imagem(height)

            // Percorre cada pixel da imagem
            for (int y = 0; y < altura; y++) {
                for (int x = 0; x < largura; x++) {
                    // Obtém o valor RGB do pixel
                    int rgb = imagem.getRGB(x, y);
                    int rgbNovo = imagemFundo.getRGB(x, y);
                    Color cor = new Color(rgb);

                    // Obtém os componentes de cor
                    int diferenteR = cor.getRed();
                    int diferenteG = cor.getGreen();
                    int diferenteB = cor.getBlue();

                    if (diferenteR < 75 && diferenteG > 128 && diferenteB < 75){
                        imagemNova.setRGB(x, y, rgbNovo);
                    }
                    else {
                        imagemNova.setRGB(x, y, rgb);
                    }
                }
            }
            // Salva a nova imagem
            File output = new File("imagem_modificada.png");
            ImageIO.write(imagemNova, "png", output);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
