package stringSearcher;


public class BoyerMooreStringSearcher extends StringSearcher {
    public BoyerMooreStringSearcher(char[] string) {
        super(string);
    }

    public BoyerMooreStringSearcher(String string) {
        super(string);
    }


    public int occursIn(char[] superstring) throws NotFound {



        for (int index = 0; index < superstring.length - getString().length; index++) {
            if (occursAt(superstring,index)) { // does this string occur at this index?
                return index; // yes, so return the index
            }
        }
        throw new NotFound();
    }

    private boolean occursAt(char[] superstring,int index) {

        for (int i = 0; i < getString().length; i++) {
            if (getString()[i] != superstring[i+index]) {
                return false;
            }
        }
        return true;
    }
}
