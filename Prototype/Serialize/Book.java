import java.io.*;

class Book extends Item implements Serializable{
    private String title;
    private Barcode barCode;
    public Book(String title, Barcode barCode){
        this.title = title;
        this.barCode = barCode;
        System.out.println("Book Constructor.");
    }
    public Item makeClone(){
        Book bookObject = null;
        try{
            bookObject = (Book)super.clone();
            bookObject.barCode = (Barcode)barCode.clone();
        }
        catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return bookObject;
    }
    public void setTitle(String title){this.title = title;}
    public String toString(){
        return "Title = " + title + " Barcode = " + barCode.getBarcode();
    }
    public void setBarcode(String bCode){barCode.setBarcode(bCode);}
    public Object deepClone(){
        try{
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            ObjectOutputStream out = new ObjectOutputStream(bout);
            out.writeObject(this); // NOTE: could write this to a file
            ByteArrayInputStream bin = new ByteArrayInputStream(bout.toByteArray());
            ObjectInputStream in = new ObjectInputStream(bin);
            return (in.readObject());
        }
        catch(Exception e){
            return null;
        }
    }
}
