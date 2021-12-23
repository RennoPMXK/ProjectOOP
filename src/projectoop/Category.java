package projectoop;

public class Category {

    private String categoryId;
    private String categoryName;

    public Category() {
    }

    public Category(String categoryId, String category) {
        this.categoryId = categoryId;
        this.categoryName = category;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return categoryName;
    }
//    public void setCategoryInfo() {
//        Scanner scanner = new Scanner(System.in);
//        ArrayList<Category> arrListOfCategory = new ArrayList<Category>();
//        arrListOfCategory.add(new Category("01", "Van hoa"));
//        arrListOfCategory.add(new Category("02", "Kinh te"));
//        arrListOfCategory.add(new Category("03", "Thieu nhi"));
//        arrListOfCategory.add(new Category("04", "Lich su"));
//        arrListOfCategory.add(new Category("05", "Giao khoa"));
//        arrListOfCategory.add(new Category("06", "Ngoai ngu"));
//        arrListOfCategory.add(new Category("07", "Tam ly"));
//        for (int i = 0; i < arrListOfCategory.size(); i++) {
//            System.out.print(arrListOfCategory.get(i) + ", ");
//        }
//
//        System.out.println("Nhap the loai: ");
//        int index = 0;
//        String checkString = scanner.nextLine();
//        while (!checkString.equalsIgnoreCase(arrListOfCategory.get(index).getCategory()) && index < arrListOfCategory.size()) {
//            index++;
//            if (index == arrListOfCategory.size()) {
//                System.out.println("Nhap sai, nhap lai: ");
//                checkString = scanner.nextLine();
//                index = 0;
//            }
//        }
//        this.categoryName = checkString;
//
//    }

}
