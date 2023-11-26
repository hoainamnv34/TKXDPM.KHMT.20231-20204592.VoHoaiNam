# Repo bài tập môn Thiết kế và xây dựng phần mềm
**Tên sinh viên: Võ Hoài Nam**
**Mssv: 20204592**

Repo tuân theo Release FLow gồm các branch:
- main: deploy
- release: các lab 
- develop: nhánh phát triển
- feature, hotfix, topic, bugfix, refactor, ...

![Alt text](workflow.png)


# Week8: FINAL - Hoàn thiện mã nguồn và Unit Test cho AIMS (20/11/2023)
Hãy hoàn thiện phần kiểm thử đơn vị và lập trình theo phương pháp TDD cho các use case liên quan đến đặt hàng AIMS. Lưu ý:
Vẽ lại các biểu đồ thiết kế (biểu đồ trình tự, biểu đồ lớp) nếu có thay đổi thiết kế. Bản thiết kế cần tuyệt đối giống mã nguồn
 Phần thanh toán dùng VNPay cần vẽ lại và lập trình để kết nối và thực hiện thanh toán thành công theo đúng thực tế. Có thể dùng Paypal thay cho VNPay hoặc cả hai (được bonus điểm)
Viết rõ hướng tiếp cận test (hộp đen hay hộp trắng) và kỹ thuật kiểm thử (VD phân vùng tương đương, bảng quyết định trong hộp đen) cho các tính năng nào trong sheet Testing Approach Strategy
Phần Test Scenario có thể dùng chung cho các Unit Test (do các bước có thể giống nhau), phần Unit Test nào khác (thêm các bước khác như chuẩn bị dữ liệu, kết nối các thành phần...) thì mới cần đặc tả riêng.
Không cần ánh xạ Requirement và Test case, chỉ cần ánh xạ Test case với Use case. Phần Requirement bỏ trống.
Unit Test ngoài phần viết test cho các phương thức liên quan đến validate dữ liệu, cần viết các unit test cho các phương thức liên quan đến nghiệp vụ của bài toán như kiểm tra hàng còn không, tính phí shipping (đơn thường và đơn nhanh), tính hoá đơn, thanh toán đơn hàng...

 PS: Nhắc lại các bước thực hiện TDD như sau:
Viết khung mã nguồn / sinh khung mã nguồn từ bản thiết kế (classs diagrams, interaction diagrams)
Thiết kế các trường hợp kiểm thử theo các kỹ thuật kiểm thử hộp đen như Phân vùng tương đương, Phân tích giá trị biên, Bảng quyết định.
Xây dựng các trường hợp kiểm thử trên JUnit cho các lớp trong các use case liên quan đến đặt hàng trong Project Java AIMS, tham khảo mã nguồn ví dụ trên https://github.com/trangntt-for-student/AIMS
Lập trình đầy đủ cho các use case liên quan đến đặt hàng trong AIMS cho đến khi thoả mãn tất cả các test case ở trên (pass)
Điền và hoàn thành file TestPlan theo template trong thư mục Template trong folder môn học https://drive.google.com/drive/folders/16xudhbh-hf5Ypc8hR7FoEvf2SeOufmkp
