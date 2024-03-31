create database Shopsite;
use Shopsite;

create table userlogins(
sno int NOT NULL AUTO_INCREMENT primary key ,userid varchar(10) , password varchar(50)
);

insert into userlogins(userid,password) values("admin","admin@123");


create table mobile(
sno int NOT NULL AUTO_INCREMENT primary key ,M_ID int unique,M_NAME char(255),M_DESCRIPTION varchar(255),M_COST int(50)
);
create table tripods(
sno int NOT NULL AUTO_INCREMENT primary key ,T_ID int unique,T_NAME char(255),T_DESCRIPTION varchar(255),T_COST int(50)
);
create table lights(
sno int NOT NULL AUTO_INCREMENT primary key ,L_ID int unique,L_NAME char(255),L_DESCRIPTION varchar(255),L_COST int(50)
);
create table camera(
sno int NOT NULL AUTO_INCREMENT primary key ,C_ID int unique,C_NAME char(255),C_DESCRIPTION varchar(255),C_COST int(50)
);


insert into mobile(M_ID,M_NAME,M_DESCRIPTION,M_COST) values 
(1001,"I15 ProMax Unlocked Android Phone ","5G Cell Phone | 8GB+128GB | Unique Titanium Design | 6.7 HD Screen | 50MP+13MP Camera | 5000mAh Large Battery | Dual SIM Capability (Black)",9164.81),
(1002,"SAMSUNG Galaxy A15","5G A Series Cell Phone | 128GB Unlocked Android Smartphone | AMOLED Display | Expandable Storage | Knox Security | Super Fast Charging - US Version 2024 | Blue Black",16663.97),
(1003,"Motorola Moto G","Power 5G | 2023 | Unlocked | Made for US 6/256GB | 50 MPCamera | Mineral Black, 163.06 x 74.8 x 8.45mm",16663.97),
(1004,"SAMSUNG Galaxy Z Flip 5","Cell Phone, Unlocked Android Smartphone, 256GB, Compact, Foldable Design, One-Hand Control, Best Selfies, 12MP Camera, Large Cover Screen, US Version, 2023, Lavender",70824.57),
(1005,"OnePlus Nord N30 ","5G | Unlocked Dual-SIM Android Smart Phone | 6.7 LCD Display | 8+128GB | 5000 mAhBattery | 50W FastCharging | 108MP Camera | Chromatic Gray", 24996.37);

insert into tripods(T_ID,T_NAME,T_DESCRIPTION,T_COST) values 
(2001,"Selfie Stick Tripod","Detachable Wireless Remote, 4 in 1 Extendable Portable Selfie Stick & Phone Tripod Stand Compatible with Gopro, iPhone/Samsung/Huawei, etc.",832.41),
(2002,"Amazon Basics(Silver)","60-Inch Lightweight Tripod With Bag, Black",1534.83),
(2003,"Amazon Basics(Golden)","60-Inch Lightweight Tripod With Bag, Black",2998.83),
(2004,"Weilisi for iphone","64 Aluminum Phone Tripod & Selfie Stick Tripod with Remote, Upgraded Phone Tripod Stand All-in-1 & Travel Tripod, Durable Cell Phone Tripod Compatible with All Cellphones",1665.65),
(2005,"CAVIX carbon fibre","Lightweight Portable Travel Tripod with Low Profile Ball Head with 1/4 Quick Release Plate Compatible with Camera Max Load 22lbs",9998.05);

insert into lights(L_ID,L_NAME,L_DESCRIPTION,L_COST) values 
(3001,"RGB LED Strip Lights with APP & Remote Control","Luces LED para Cuarto, Bluetooth LED Lights for Room, Home Decoration",665.76),
(3002,"Smart Light Bulbs",", WiFi Bluetooth Dimmable LED RGB Light Bulbs, Full Color Changing Light Bulb Smart Light Bulbs Compatible with Alexa & Google Assistant, 9W 800 Lumens No Hub Required, 2 Pack",999.05),
(3003,"RGB Light Bar","Music Sync RGB IC LED Lights Bars, USB Powered Ambient Lighting, Remote Control Color Changing Gaming TV Backlight, 8 Dynamic Modes for PC Room Monitor Desk",1332.3),
(3004,"VIJIM VL100C Bi-Color LED Video Light on Camera",",Mini Rechargeable 2000mAh LED Camera Lights,CRI95+ Dimmable 2500-6500K Ultra Bright Photo and Video Lighting,LED Fill Lamp",1662.31),
(3005,"P96L RGB Video Light by SmallRig","Portable Metal LED Camera Light, 2500-9000K, 21 Effects, CRI 96+, OLED Display, Photo and Video Lighting, Long Battery Life, Fits Phone and Camera Sony, Nikon - 3489B",2991.33);

insert into camera(C_ID,C_NAME,C_DESCRIPTION,C_COST) values 
(4001,"Digital Camera","4K Ultra HD Cameras for Photography, Digital Point and Shoot Camera with 56Mp Autofocus 20X Zoom Anti Shake, Video Camera with 32GB SD Card for Adults, Teens, Beginners(Silver)",3832.07),
(4002,"Digital Camera","FHD 1080P Camera, Digital Point and Shoot Camera with 16X Zoom Anti Shake, Compact Small Camera for Boys Girls Kids",4165.37),
(4003,"Fujifilm Instax Mini 12 Instant Film Camera - Pastel Blue","The super bubbly INSTAX MINI 12™ instant camera available in five super cute and appealing tones [Pastel Blue, Mint Green, Blossom Pink, Lilac Purple and Clay White] contain easy-to-use modes and controls.",5828.51),
(4004,"4K Digital Camera for Photography","Auto-Focus 4K Camera with 180° 3.0 inch Flip Screen 16X Anti-Shake Vlogging Camera for YouTube Video Compact Cameras with SD Card, 2 Batteries and Battery Charger",9414.78),
(4005,"Saneen Digital Camera","4k Cameras for Photography & Video, 64MP WiFi Touch Screen Vlogging Camera for YouTube with Flash, 32GB SD Card, Lens Hood, 3000mAH Battery, Front and Rear Cameras - Black",13331.01);




select * from mobile;
select * from tripods;
select * from lights;
select * from camera;


