
package pl.targosz.homework.CinemaSit;

public class CinemaSit {
    protected int id=5;
    protected char row='A';
    protected boolean ifTaken;

    public CinemaSit(int id,char row, boolean ifTaken) {
        this.id = id;
        this.row = row;
        this.ifTaken = ifTaken;
    }
}
