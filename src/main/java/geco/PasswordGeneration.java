package geco;

public class PasswordGeneration {
    /**
     * password généré de 8 caractères.
     */
    private static String[] password = new String[8];
    /**
     * Constante de longueur du mot de passe.
     */
    private final static int LENGTH = 8;

    /**
     * Fonction de génération de mdp.
     * @return pass qui correspond au mdp généré.
     */
    public final String getRandomPassword() {
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890"; // Tu supprimes les lettres dont tu ne veux pas
        String pass = "";
        for(int x=0;x<LENGTH;x++)
        {
            int i = (int)Math.floor(Math.random() * 62); // Si tu supprimes des lettres tu diminues ce nb
            pass += chars.charAt(i);
        }
        return pass;
    }
}
