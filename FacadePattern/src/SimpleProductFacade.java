
public class SimpleProductFacade {
    DifficultProduct mDifficultProduct;

    public SimpleProductFacade(DifficultProduct difficultProduct) {
        mDifficultProduct = difficultProduct;
    }

    public void setName(String name) {
        char chars[] = name.toCharArray();
        if (chars.length != 7) {
            return;
        }
        mDifficultProduct.setFirstNameCharacter(chars[0]);
        mDifficultProduct.setSecondNameCharacter(chars[1]);
        mDifficultProduct.setThirdNameCharacter(chars[2]);
        mDifficultProduct.setFourthNameCharacter(chars[3]);
        mDifficultProduct.setFifthNameCharacter(chars[4]);
        mDifficultProduct.setSixthNameCharacter(chars[5]);
        mDifficultProduct.setSeventhNameCharacter(chars[6]);
    }

    public String getName() {
        return mDifficultProduct.getName();
    }
}
