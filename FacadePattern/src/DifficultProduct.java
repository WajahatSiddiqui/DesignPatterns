
public class DifficultProduct {
    char mNameChars[] = new char[7];

    public DifficultProduct() {
    }

    public void setFirstNameCharacter(char c) {
        mNameChars[0] = c;
    }

    public void setSecondNameCharacter(char c) {
        mNameChars[1] = c;
    }

    public void setThirdNameCharacter(char c) {
        mNameChars[2] = c;
    }

    public void setFourthNameCharacter(char c) {
        mNameChars[3] = c;
    }

    public void setFifthNameCharacter(char c) {
        mNameChars[4] = c;
    }

    public void setSixthNameCharacter(char c) {
        mNameChars[5] = c;
    }

    public void setSeventhNameCharacter(char c) {
        mNameChars[6] = c;
    }

    public String getName() {
        return new String(mNameChars);
    }
}
