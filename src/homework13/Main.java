package homework13;

public class Main {

    public static void main(String[] args) {
        FileNavigator fileNavigator = new FileNavigator();
        FileData fileData1 = new FileData("fs12sg.txt", 125, "/home/user/1");
        FileData fileData2 = new FileData("fs1dcs.txt", 250, "/home/user/2");
        FileData fileData3 = new FileData("fs451g.doc", 15, "/home/user/3");
        FileData fileData4 = new FileData("f2sslk.txt", 127, "/home/user/1");
        FileData fileData5 = new FileData("fs1gccs.txt", 350, "/home/user/2");
        FileData fileData6 = new FileData("fs451g.doc", 157, "/home/user/1");
        FileData fileData7 = new FileData("fs45k.txt", 1282, "/home/user/4");
        FileData fileData8 = new FileData("fs74k.txt", 402, "/home/user/4");

        fileNavigator.add("/home/user/1", fileData1);
        fileNavigator.add("/home/user/2", fileData2);
        fileNavigator.add("/home/user/3", fileData3);
        fileNavigator.add("/home/user/3", fileData4);
        fileNavigator.add("/home/user/1", fileData5);
        fileNavigator.add("/home/user/1", fileData6);
        fileNavigator.add("/home/user/4", fileData7);
        fileNavigator.add("/home/user/4", fileData8);
        fileNavigator.print();
        System.out.println();

        System.out.println("******  Find  *******");
        System.out.println((fileNavigator.find("/home/user/1")));
        System.out.println();

        System.out.println("******  Filter by size  *******");
        System.out.println(fileNavigator.filterBySize(350));
        System.out.println();

        System.out.println("*****  Remove  ********");
        System.out.println("Removed files: " + fileNavigator.remove("/home/user/3"));
        fileNavigator.print();
        System.out.println();

        System.out.println("******  Sort by size  *******");
        System.out.println(fileNavigator.sortBySize());
    }
}
