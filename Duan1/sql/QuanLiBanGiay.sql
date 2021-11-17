CREATE DATABASE QuanLiBanGiay
GO 

USE QuanLiBanGiay
GO

CREATE TABLE LoaiSanPham(
MaThuongHieu VARCHAR(10) PRIMARY KEY,
TenThuongHieu NVARCHAR(20) NOT NULL,
TrangThai BIT NOT NULL,
);

CREATE TABLE NhanVien(
MaNV VARCHAR(10) PRIMARY KEY,
TenNV NVARCHAR(50) NOT NULL,
MatKhau VARCHAR(50) NOT NULL,
DiaChi NVARCHAR(50) NOT NULL,
SDT VARCHAR(15) NOT NULL,
Email VARCHAR(50) NOT NULL,
NgaySinh DATE NOT NULL,
GioiTinh BIT NOT NULL,
AnhNV VARCHAR(30) NOT NULL,
TrangThai BIT NOT NULL,
VaiTro BIT NOT NULL,
MaXacNhan VARCHAR(6) NULL,
);

CREATE TABLE SanPham(
MaSP VARCHAR(10) PRIMARY KEY,
MaThuongHieu VARCHAR(10) NOT NULL,
TenSanPham NVARCHAR(50) NOT NULL,
GiaBan MONEY NOT NULL,
SoLuong INT NOT NULL,
AnhSP VARCHAR(30) NOT NULL,
ChiTiet NVARCHAR(50) NULL,
TrangThai BIT NOT NULL,

FOREIGN KEY (MaThuongHieu) REFERENCES dbo.LoaiSanPham(MaThuongHieu),
);

CREATE TABLE NhaCungCap(
MaNCC VARCHAR(10) PRIMARY KEY,
TenNCC NVARCHAR(50) NOT NULL,
DiaChi NVARCHAR(50) NOT NULL,
SDT VARCHAR(15) NOT NULL,
Email VARCHAR(50) NOT NULL,
TrangThai BIT NOT NULL,

);

CREATE TABLE KhachHang(
MaKH VARCHAR(10) PRIMARY KEY,
TenKH NVARCHAR(50) NOT NULL,
SDT VARCHAR(15) NOT NULL,
Email VARCHAR(50) NOT NULL,
NgaySinh DATE NOT NULL,
GioiTinh BIT NOT NULL,
TichDiem INT NOT NULL,
MaNV VARCHAR(10) NOT NULL,
TrangThai BIT NOT NULL,

FOREIGN KEY (MaNV) REFERENCES NhanVien(MaNV),
);

CREATE TABLE KhuyenMai(
MaKM VARCHAR(10) PRIMARY KEY,
MaNV VARCHAR(10) NOT NULL,
MaSP VARCHAR(10) NOT NULL,
TenKM NVARCHAR(30) NOT NULL,
GiaTri VARCHAR(5) NOT NULL,
NgayTao DATE NOT NULL,
NgayBatDau DATE NOT NULL,
NgayKetThuc DATE NOT NULL,
GhiChu NVARCHAR(50) NULL,
TrangThai BIT NOT NULL,

FOREIGN KEY (MaNV) REFERENCES NhanVien(MaNV),
FOREIGN KEY (MaSP) REFERENCES dbo.SanPham(MaSP),
);

CREATE TABLE HoaDonThanhToan(
MaHDThanhToan VARCHAR(10) PRIMARY KEY,
MaKhachHang VARCHAR(10) NOT NULL,
MaNhanVien VARCHAR(10) NOT NULL,
NgayThanhToan DATE NOT NULL,
DiemThuong INT NOT NULL,
GhiChu NVARCHAR(50) NULL,

FOREIGN KEY (MaKhachHang) REFERENCES dbo.KhachHang(MaKH),
FOREIGN KEY (MaNhanVien) REFERENCES dbo.NhanVien(MaNV),
);

CREATE TABLE ChiTietHoaDonThanhToan(
MaHDChiTiet VARCHAR(10) PRIMARY KEY,
MaHDThanhToan VARCHAR(10) NOT NULL,
MaKhuyenMai VARCHAR(10) NOT NULL,
MaSanPham VARCHAR(10) NOT NULL,
DonGia MONEY NOT NULL,
SoLuong INT NOT NULL,

FOREIGN KEY (MaHDThanhToan) REFERENCES dbo.HoaDonThanhToan(MaHDThanhToan),
FOREIGN KEY (MaKhuyenMai) REFERENCES dbo.KhuyenMai(MaKM),
FOREIGN KEY (MaSanPham) REFERENCES dbo.SanPham(MaSP),
);

CREATE TABLE HoaDonNhapHang(
MaHDNhapHang VARCHAR(10) PRIMARY KEY,
MaNV VARCHAR(10) NOT NULL,
MaNCC VARCHAR(10) NOT NULL,
NgayNhapHang DATE NOT NULL,
GhiChu NVARCHAR(50) NULL,

FOREIGN KEY (MaNV) REFERENCES dbo.NhanVien(MaNV),
FOREIGN KEY (MaNCC) REFERENCES dbo.NhaCungCap(MaNCC),
);

CREATE TABLE ChiTietHoaDonNhapHang(
MaHDNhapHang VARCHAR(10) NOT NULL,
MaSP VARCHAR(10) NOT NULL,
GiaNhap MONEY NOT NULL,
SoLuong INT NOT NULL,

PRIMARY KEY (MaHDNhapHang, MaSP),
);

INSERT INTO dbo.LoaiSanPham VALUES 
('TH001', N'Adidas'),
('TH002', N'Nike'),
('TH003', N'Dincox'),
('TH004', N'Puma'),
('TH005', N'Vans');

INSERT INTO dbo.NhanVien VALUES
('PH17245', N'Nguyễn Bá Hà', 'baha123', N'Hà Nội', '0325878373', 'hanbph17245@fpt.edu.vn', '20020516', 1, 'baha123.png', 1, 1, NULL),
('PH17417', N'Nguyễn Phú Quang', 'quang123', N'Hà Nội', '0936352884', 'quangnpph17417@fpt.edu.vn', '20021004', 1, 'quang123.png', 1, 1, NULL),
('PH17481', N'Nguyễn Công Trường', 'truong123', N'Hà Nội', '0964853798', 'truongncph17481@fpt.edu.vn', '20020722', 1, 'truong123.png', 1, 1, NULL),
('PH18383', N'Nguyễn Văn Huy', 'vanhuy123', N'Hà Nội', '0338327433', 'huynvph18383@fpt.edu.vn', '20020222', 1, 'vanhuy123.png', 1, 1, NULL),
('PH17446', N'Nguyễn Tiến Hải', 'tienhai123', N'Hà Nội', '0347766383', 'haintph17446@fpt.edu.vn', '20021223', 1, 'tienhai123.png', 1, 1, NULL);

INSERT INTO dbo.SanPham VALUES
('SP001VANG40', 'TH001', N'UltraBoost 21', 5000000, 5, 'sp001.png', NULL),
('SP002', 'TH001', N'Alphabounce', 3000000, 10, 'sp002.png', NULL),
('SP003', 'TH001', N'ZX 1K Boost', 2500000, 10, 'sp003.png', NULL),
('SP004', 'TH002', N'Nike Revolution 5 Nam', 1790000, 15, 'sp004.png', NULL),
('SP005', 'TH002', N'Nike Zoom Fly 3 Nữ', 3690000, 10, 'sp005.png', NULL),
('SP006', 'TH002', N'Nike Air Zoom Structure 24', 3390000, 10, 'sp006.png', NULL),
('SP007', 'TH003', N'E03 Grey', 455000, 20, 'sp007.png', NULL),
('SP008', 'TH003', N'D07 TAN-WHT', 344000, 20, 'sp008.png', NULL),
('SP009', 'TH003', N'D21 KHAKI WASH', 350000, 20, 'sp009.png', NULL),
('SP010', 'TH004', N'Puma Ralph Sampson', 1770000, 10, 'sp010.png', NULL),
('SP011', 'TH004', N'Puma Caracal Suede', 1770000, 10, 'sp011.png', NULL),
('SP012', 'TH004', N'Puma Clyde Stitch', 1990000, 10, 'sp012.png', NULL),
('SP013', 'TH005', N'Vans Caro', 350000, 30, 'sp013.png', NULL),
('SP014', 'TH005', N'Vans Old Skool', 640000, 20, 'sp014.png', NULL),
('SP015', 'TH005', N'Vans Retro Sport', 640000, 20, 'sp015.png', NULL);

INSERT INTO dbo.NhaCungCap VALUES
('NCC001', N'Công Ty JUNO', N'Quận 7-Thành phố Hồ Chí Minh', '18001160', 'cskh@juno.vn', );

SELECT * FROM dbo.NhanVien
SELECT * FROM dbo.KhachHang
INSERT INTO KhachHang (MaKH, TenKH, SDT, Email, NgaySinh, GioiTinh, TichDiem, MaNV)  VALUES (;
UPDATE dbo.KhachHang SET TenKH=?, SDT=?, Email=?, NgaySinh=?, GioiTinh=?, TichDiem=?, MaNV=? WHERE MaKH=?;
SELECT * FROM dbo.NhaCungCap
ORDER BY MaNCC OFFSET ? * 10 ROWS FETCH NEXT 10 ROWS ONLY;
SELECT Email, MaXacNhan FROM dbo.NhanVien