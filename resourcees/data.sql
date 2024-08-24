INSERT INTO supplier (company_name, website, location, nature_of_business) VALUES
('ABC Manufacturing', 'http://abc.com', 'India', 'SMALL_SCALE'),
('XYZ Manufacturing', 'http://xyz.com', 'India', 'MEDIUM_SCALE');

INSERT INTO supplier_manufacturing_processes (supplier_supplier_id, manufacturing_processes) VALUES
(1, 'PRINTING_3D'),
(2, 'CASTING');
