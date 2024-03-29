var availableTags = [
	"AA",
	"AAI",
	"AAN",
	"AAP",
	"AAR",
	"AAV",
	"AB",
	"ABA",
	"ABB",
	"ABC",
	"ABD",
	"ABG",
	"ABK",
	"ABM",
	"ABR",
	"ABT",
	"ABV",
	"ABVT",
	"ABX",
	"ACC",
	"ACE",
	"ACF",
	"ACG",
	"ACH",
	"ACI",
	"ACL",
	"ACM",
	"ACN",
	"ACO",
	"ACS",
	"ACV",
	"ADC",
	"ADI",
	"ADM",
	"ADP",
	"ADS",
	"ADX",
	"ADY",
	"AEA",
	"AEB",
	"AEC",
	"AED",
	"AEE",
	"AEF",
	"AEG",
	"AEH",
	"AEL",
	"AEM",
	"AEO",
	"AEP",
	"AER",
	"AES",
	"AET",
	"AEV",
	"AF",
	"AFB",
	"AFC",
	"AFE",
	"AFF",
	"AFG",
	"AFL",
	"AFN",
	"AGC",
	"AGCO",
	"AGD",
	"AGL",
	"AGM",
	"AGN",
	"AGO",
	"AGP",
	"AGU",
	"AHC",
	"AHD",
	"AHL",
	"AHS",
	"AHT",
	"AI",
	"AIB",
	"AIG",
	"AIN",
	"AIQ",
	"AIR",
	"AIT",
	"AIV",
	"AIZ",
	"AJG",
	"AKF",
	"AKP",
	"AKR",
	"AKS",
	"AKT",
	"ALB",
	"ALC",
	"ALD",
	"ALE",
	"ALEX",
	"ALF",
	"ALG",
	"ALJ",
	"ALK",
	"ALL",
	"ALM",
	"ALQ",
	"ALU",
	"ALV",
	"ALX",
	"ALY",
	"ALZ",
	"AM",
	"AMB",
	"AMD",
	"AME",
	"AMG",
	"AMN",
	"AMP",
	"AMR",
	"AMT",
	"AMX",
	"AN",
	"ANF",
	"ANH",
	"ANN",
	"ANR",
	"ANW",
	"AOB",
	"AOD",
	"AOI",
	"AOL",
	"AON",
	"AOS",
	"AP",
	"APA",
	"APB",
	"APC",
	"APD",
	"APF",
	"APH",
	"APL",
	"APU",
	"APX",
	"ARB",
	"ARD",
	"ARE",
	"ARG",
	"ARI",
	"ARJ",
	"ARK",
	"ARL",
	"ARM",
	"ARO",
	"ARP",
	"ART",
	"ARW",
	"ASA",
	"ASF",
	"ASG",
	"ASH",
	"ASI",
	"ASP",
	"ASR",
	"ASX",
	"ATE",
	"ATI",
	"ATK",
	"ATO",
	"ATR",
	"ATT",
	"ATU",
	"ATV",
	"ATW",
	"AU",
	"AUO",
	"AUY",
	"AV",
	"AVA",
	"AVB",
	"AVD",
	"AVF",
	"AVK",
	"AVP",
	"AVT",
	"AVX",
	"AVY",
	"AWC",
	"AWF",
	"AWH",
	"AWI",
	"AWK",
	"AWP",
	"AWR",
	"AXA",
	"AXE",
	"AXL",
	"AXP",
	"AXR",
	"AXS",
	"AYE",
	"AYI",
	"AYN",
	"AYR",
	"AZN",
	"AZO",
	"AZZ",
	"BA",
	"BAC",
	"BAF",
	"BAK",
	"BAM",
	"BAP",
	"BAS",
	"BAX",
	"BBD",
	"BBF",
	"BBG",
	"BBI",
	"BBK",
	"BBL",
	"BBT",
	"BBV",
	"BBVA",
	"BBW",
	"BBX",
	"BBY",
	"BC",
	"BCA",
	"BCE",
	"BCF",
	"BCH",
	"BCK",
	"BCO",
	"BCR",
	"BCS",
	"BDC",
	"BDF",
	"BDJ",
	"BDK",
	"BDN",
	"BDT",
	"BDV",
	"BDX",
	"BE",
	"BEC",
	"BEE",
	"BEN",
	"BEO",
	"BEP",
	"BEZ",
	"BFK",
	"BFO",
	"BFR",
	"BFS",
	"BFZ",
	"BG",
	"BGC",
	"BGG",
	"BGH",
	"BGP",
	"BGR",
	"BGS",
	"BGT",
	"BGY",
	"BHD",
	"BHE",
	"BHI",
	"BHK",
	"BHL",
	"BHP",
	"BHS",
	"BHY",
	"BID",
	"BIE",
	"BIF",
	"BIG",
	"BIN",
	"BIO",
	"BIP",
	"BJ",
	"BJS",
	"BJZ",
	"BK",
	"BKC",
	"BKD",
	"BKE",
	"BKH",
	"BKI",
	"BKK",
	"BKN",
	"BKS",
	"BKT",
	"BLC",
	"BLH",
	"BLK",
	"BLL",
	"BLT",
	"BLU",
	"BLW",
	"BLX",
	"BMA",
	"BMC",
	"BME",
	"BMI",
	"BMO",
	"BMR",
	"BMS",
	"BMT",
	"BMY",
	"BNA",
	"BNE",
	"BNI",
	"BNJ",
	"BNS",
	"BNY",
	"BOE",
	"BOH",
	"BP",
	"BPI",
	"BPK",
	"BPL",
	"BPO",
	"BPP",
	"BPT",
	"BPZ",
	"BQH",
	"BQR",
	"BR",
	"BRC",
	"BRE",
	"BRF",
	"BRFS",
	"BRO",
	"BRS",
	"BRT",
	"BRY",
	"BSBR",
	"BSC",
	"BSD",
	"BSE",
	"BSI",
	"BSP",
	"BSX",
	"BSY",
	"BT",
	"BTA",
	"BTE",
	"BTF",
	"BTH",
	"BTM",
	"BTO",
	"BTU",
	"BTZ",
	"BUD",
	"BVF",
	"BVN",
	"BW",
	"BWA",
	"BWF",
	"BWP",
	"BWS",
	"BWY",
	"BX",
	"BXC",
	"BXG",
	"BXP",
	"BXS",
	"BYD",
	"BYI",
	"BYM",
	"BZ",
	"BZA",
	"BZH",
	"BZMD",
	"CA",
	"CAB",
	"CACI",
	"CAE",
	"CAF",
	"CAG",
	"CAH",
	"CAJ",
	"CAL",
	"CAM",
	"CAP",
	"CAS",
	"CASC",
	"CAT",
	"CATO",
	"CB",
	"CBB",
	"CBC",
	"CBD",
	"CBE",
	"CBG",
	"CBI",
	"CBK",
	"CBL",
	"CBM",
	"CBR",
	"CBS",
	"CBT",
	"CBU",
	"CBY",
	"CBZ",
	"CCC",
	"CCE",
	"CCH",
	"CCI",
	"CCJ",
	"CCK",
	"CCL",
	"CCM",
	"CCO",
	"CCS",
	"CCT",
	"CCU",
	"CCW",
	"CCZ",
	"CDE",
	"CDI",
	"CDR",
	"CE",
	"CEA",
	"CEC",
	"CEE",
	"CEG",
	"CEL",
	"CEO",
	"CF",
	"CFI",
	"CFL",
	"CFN",
	"CFR",
	"CFT",
	"CFX",
	"CGA",
	"CGI",
	"CGO",
	"CGV",
	"CGX",
	"CHA",
	"CHB",
	"CHC",
	"CHD",
	"CHE",
	"CHG",
	"CHH",
	"CHI",
	"CHK",
	"CHL",
	"CHN",
	"CHP",
	"CHS",
	"CHSP",
	"CHT",
	"CHU",
	"CHW",
	"CHY",
	"CI",
	"CIA",
	"CIB",
	"CIE",
	"CIF",
	"CIG",
	"CII",
	"CIM",
	"CIR",
	"CIT",
	"CIU",
	"CIX",
	"CJA",
	"CJB",
	"CJR",
	"CJS",
	"CJT",
	"CKH",
	"CKP",
	"CKR",
	"CL",
	"CLB",
	"CLC",
	"CLD",
	"CLF",
	"CLH",
	"CLI",
	"CLNY",
	"CLP",
	"CLR",
	"CLS",
	"CLU",
	"CLW",
	"CLX",
	"CM",
	"CMA",
	"CMC",
	"CME",
	"CMG",
	"CMI",
	"CMK",
	"CML",
	"CMM",
	"CMN",
	"CMO",
	"CMP",
	"CMS",
	"CMU",
	"CMZ",
	"CN",
	"CNA",
	"CNC",
	"CNH",
	"CNI",
	"CNK",
	"CNL",
	"CNN",
	"CNO",
	"CNP",
	"CNQ",
	"CNS",
	"CNW",
	"CNX",
	"CO",
	"COF",
	"COG",
	"COH",
	"COL",
	"COO",
	"COP",
	"COT",
	"COV",
	"COY",
	"CP",
	"CPA",
	"CPB",
	"CPC",
	"CPE",
	"CPF",
	"CPK",
	"CPL",
	"CPN",
	"CPO",
	"CPP",
	"CPT",
	"CPV",
	"CPX",
	"CPY",
	"CQB",
	"CR",
	"CRA",
	"CRE",
	"CRH",
	"CRI",
	"CRK",
	"CRL",
	"CRM",
	"CRN",
	"CRP",
	"CRR",
	"CRS",
	"CRT",
	"CRY",
	"CS",
	"CSA",
	"CSC",
	"CSE",
	"CSH",
	"CSJ",
	"CSK",
	"CSL",
	"CSP",
	"CSQ",
	"CSR",
	"CSS",
	"CSU",
	"CSV",
	"CSX",
	"CT",
	"CTB",
	"CTC",
	"CTL",
	"CTS",
	"CTV",
	"CUB",
	"CUK",
	"CUZ",
	"CV",
	"CVA",
	"CVB",
	"CVC",
	"CVD",
	"CVE",
	"CVG",
	"CVH",
	"CVI",
	"CVO",
	"CVS",
	"CVX",
	"CW",
	"CWF",
	"CWT",
	"CWZ",
	"CX",
	"CXE",
	"CXG",
	"CXH",
	"CXO",
	"CXS",
	"CXW",
	"CY",
	"CYD",
	"CYE",
	"CYH",
	"CYN",
	"CYS",
	"CYT",
	"CZZ",
	"DAC",
	"DAI",
	"DAL",
	"DAN",
	"DAR",
	"DB",
	"DBD",
	"DBN",
	"DCA",
	"DCE",
	"DCI",
	"DCM",
	"DCO",
	"DCP",
	"DCS",
	"DCT",
	"DCW",
	"DD",
	"DDE",
	"DDF",
	"DDR",
	"DDS",
	"DDT",
	"DE",
	"DEB",
	"DEG",
	"DEI",
	"DEL",
	"DEO",
	"DEP",
	"DES",
	"DEW",
	"DEX",
	"DEXO",
	"DF",
	"DFG",
	"DFP",
	"DFR",
	"DFS",
	"DFT",
	"DFY",
	"DG",
	"DGF",
	"DGI",
	"DGW",
	"DGX",
	"DHF",
	"DHG",
	"DHI",
	"DHM",
	"DHR",
	"DHT",
	"DHX",
	"DIN",
	"DIS",
	"DJP",
	"DK",
	"DKC",
	"DKF",
	"DKI",
	"DKK",
	"DKL",
	"DKM",
	"DKP",
	"DKQ",
	"DKR",
	"DKS",
	"DKT",
	"DKW",
	"DKX",
	"DKY",
	"DL",
	"DLB",
	"DLM",
	"DLN",
	"DLR",
	"DLX",
	"DM",
	"DNB",
	"DNP",
	"DNR",
	"DNY",
	"DO",
	"DOLE",
	"DOM",
	"DON",
	"DOV",
	"DOW",
	"DOX",
	"DPC",
	"DPD",
	"DPL",
	"DPM",
	"DPO",
	"DPS",
	"DPZ",
	"DRC",
	"DRE",
	"DRH",
	"DRI",
	"DRL",
	"DRP",
	"DRQ",
	"DRU",
	"DSF",
	"DSM",
	"DST",
	"DSU",
	"DSW",
	"DSX",
	"DT",
	"DTE",
	"DTF",
	"DTG",
	"DTK",
	"DTN",
	"DTT",
	"DTV",
	"DUA",
	"DUC",
	"DUF",
	"DUK",
	"DV",
	"DVA",
	"DVD",
	"DVF",
	"DVM",
	"DVN",
	"DVR",
	"DVY",
	"DW",
	"DWA",
	"DX",
	"DXB",
	"DY",
	"DYN",
	"DYP",
	"EAC",
	"EAT",
	"EBF",
	"EBI",
	"EBR",
	"EBS",
	"EC",
	"ECA",
	"ECL",
	"ED",
	"EDD",
	"EDE",
	"EDN",
	"EDR",
	"EDS",
	"EDT",
	"EDU",
	"EE",
	"EEA",
	"EEH",
	"EEM",
	"EEP",
	"EEQ",
	"EFA",
	"EFG",
	"EFR",
	"EFT",
	"EFV",
	"EFX",
	"EGF",
	"EGN",
	"EGO",
	"EGP",
	"EGY",
	"EHA",
	"EHB",
	"EHI",
	"EHL",
	"EIG",
	"EIX",
	"EJ",
	"EK",
	"EL",
	"ELN",
	"ELP",
	"ELS",
	"ELX",
	"ELY",
	"EM",
	"EMC",
	"EMD",
	"EME",
	"EMF",
	"EMN",
	"EMO",
	"EMQ",
	"EMR",
	"EMS",
	"ENB",
	"ENH",
	"ENI",
	"ENL",
	"ENP",
	"ENR",
	"ENS",
	"ENT",
	"ENZ",
	"EOC",
	"EOD",
	"EOE",
	"EOG",
	"EOI",
	"EOS",
	"EOT",
	"EP",
	"EPB",
	"EPD",
	"EPE",
	"EPL",
	"EPP",
	"EPR",
	"EQR",
	"EQS",
	"EQT",
	"EQY",
	"ERF",
	"ERJ",
	"ERO",
	"ES",
	"ESC",
	"ESD",
	"ESE",
	"ESI",
	"ESL",
	"ESS",
	"ESV",
	"ETB",
	"ETE",
	"ETG",
	"ETH",
	"ETJ",
	"ETM",
	"ETN",
	"ETO",
	"ETP",
	"ETR",
	"ETV",
	"ETW",
	"ETY",
	"EV",
	"EVC",
	"EVF",
	"EVG",
	"EVN",
	"EVR",
	"EVT",
	"EW",
	"EWD",
	"EWH",
	"EWI",
	"EWJ",
	"EWK",
	"EWL",
	"EWM",
	"EWN",
	"EWP",
	"EWQ",
	"EWS",
	"EWT",
	"EWU",
	"EWY",
	"EWZ",
	"EXC",
	"EXG",
	"EXH",
	"EXI",
	"EXM",
	"EXP",
	"EXR",
	"EZA",
	"FAC",
	"FAF",
	"FAM",
	"FAV",
	"FBC",
	"FBN",
	"FBP",
	"FBR",
	"FC",
	"FCF",
	"FCH",
	"FCJ",
	"FCN",
	"FCS",
	"FCT",
	"FCX",
	"FCY",
	"FCZ",
	"FDG",
	"FDI",
	"FDO",
	"FDP",
	"FDS",
	"FDX",
	"FE",
	"FEO",
	"FEU",
	"FEZ",
	"FF",
	"FFA",
	"FFC",
	"FFD",
	"FFG",
	"FFH",
	"FGB",
	"FGC",
	"FGE",
	"FGF",
	"FGI",
	"FGP",
	"FHI",
	"FHN",
	"FHO",
	"FHY",
	"FICO",
	"FIF",
	"FIG",
	"FII",
	"FIS",
	"FIX",
	"FJA",
	"FL",
	"FLC",
	"FLO",
	"FLR",
	"FLS",
	"FLY",
	"FMC",
	"FMD",
	"FMN",
	"FMO",
	"FMP",
	"FMR",
	"FMS",
	"FMX",
	"FMY",
	"FNA",
	"FNB",
	"FNF",
	"FNM",
	"FO",
	"FOE",
	"FOF",
	"FOR",
	"FPL",
	"FPO",
	"FPT",
	"FR",
	"FRA",
	"FRB",
	"FRE",
	"FRM",
	"FRO",
	"FRP",
	"FRT",
	"FRX",
	"FRZ",
	"FSC",
	"FSR",
	"FSS",
	"FST",
	"FT",
	"FTE",
	"FTI",
	"FTK",
	"FTO",
	"FTR",
	"FTT",
	"FUL",
	"FUN",
	"FUR",
	"FWF",
	"FXI",
	"GA",
	"GAB",
	"GAH",
	"GAI",
	"GAJ",
	"GAM",
	"GAP",
	"GAR",
	"GAS",
	"GAT",
	"GB",
	"GBB",
	"GBE",
	"GBF",
	"GBL",
	"GBX",
	"GCA",
	"GCF",
	"GCH",
	"GCI",
	"GCO",
	"GCS",
	"GCV",
	"GD",
	"GDF",
	"GDI",
	"GDL",
	"GDO",
	"GDP",
	"GDV",
	"GE",
	"GEA",
	"GEC",
	"GED",
	"GEF",
	"GEG",
	"GEJ",
	"GEO",
	"GEP",
	"GER",
	"GES",
	"GET",
	"GEX",
	"GF",
	"GFA",
	"GFF",
	"GFI",
	"GFW",
	"GFY",
	"GFZ",
	"GG",
	"GGB",
	"GGC",
	"GGG",
	"GGT",
	"GHI",
	"GHL",
	"GIB",
	"GIL",
	"GIM",
	"GIS",
	"GJB",
	"GJD",
	"GJE",
	"GJF",
	"GJG",
	"GJH",
	"GJI",
	"GJJ",
	"GJK",
	"GJL",
	"GJM",
	"GJN",
	"GJO",
	"GJP",
	"GJR",
	"GJS",
	"GJT",
	"GJV",
	"GJW",
	"GJX",
	"GKK",
	"GKM",
	"GLD",
	"GLF",
	"GLG",
	"GLP",
	"GLS",
	"GLT",
	"GLW",
	"GMA",
	"GME",
	"GMK",
	"GMR",
	"GMT",
	"GMW",
	"GMXR",
	"GNA",
	"GNI",
	"GNK",
	"GNV",
	"GNW",
	"GOF",
	"GOL",
	"GOM",
	"GOV",
	"GPC",
	"GPD",
	"GPI",
	"GPJ",
	"GPK",
	"GPN",
	"GPS",
	"GPU",
	"GPW",
	"GPX",
	"GR",
	"GRA",
	"GRB",
	"GRE",
	"GRO",
	"GRR",
	"GRS",
	"GRT",
	"GRX",
	"GS",
	"GSC",
	"GSG",
	"GSH",
	"GSI",
	"GSK",
	"GSL",
	"GSP",
	"GT",
	"GTC",
	"GTI",
	"GTN",
	"GTS",
	"GTY",
	"GU",
	"GUI",
	"GUL",
	"GUQ",
	"GUT",
	"GVA",
	"GVI",
	"GWF",
	"GWR",
	"GWW",
	"GXP",
	"GY",
	"GYA",
	"GYB",
	"GYC",
	"H",
	"HAE",
	"HAL",
	"HAR",
	"HAS",
	"HAV",
	"HBC",
	"HBI",
	"HCC",
	"HCE",
	"HCF",
	"HCH",
	"HCN",
	"HCP",
	"HCS",
	"HD",
	"HDB",
	"HE",
	"HEI",
	"HEK",
	"HEP",
	"HES",
	"HEW",
	"HF",
	"HGG",
	"HGR",
	"HGT",
	"HHS",
	"HHY",
	"HI",
	"HIF",
	"HIG",
	"HIH",
	"HIL",
	"HIO",
	"HIS",
	"HIT",
	"HIW",
	"HIX",
	"HJA",
	"HJE",
	"HJG",
	"HJJ",
	"HJL",
	"HJN",
	"HJO",
	"HJR",
	"HJT",
	"HJV",
	"HK",
	"HL",
	"HLF",
	"HLS",
	"HLX",
	"HMA",
	"HMC",
	"HME",
	"HMH",
	"HMN",
	"HMY",
	"HNI",
	"HNP",
	"HNR",
	"HNT",
	"HNZ",
	"HOC",
	"HOG",
	"HON",
	"HOO",
	"HOS",
	"HOT",
	"HOV",
	"HP",
	"HPF",
	"HPI",
	"HPQ",
	"HPS",
	"HPT",
	"HPY",
	"HQH",
	"HQL",
	"HR",
	"HRB",
	"HRC",
	"HRG",
	"HRL",
	"HRP",
	"HRPN",
	"HRS",
	"HRZ",
	"HS",
	"HSA",
	"HSC",
	"HSF",
	"HSM",
	"HSP",
	"HST",
	"HSY",
	"HT",
	"HTB",
	"HTD",
	"HTE",
	"HTH",
	"HTN",
	"HTR",
	"HTS",
	"HTX",
	"HTY",
	"HTZ",
	"HUM",
	"HUN",
	"HVT",
	"HW",
	"HWD",
	"HXL",
	"HXM",
	"HYA",
	"HYB",
	"HYC",
	"HYF",
	"HYH",
	"HYK",
	"HYL",
	"HYM",
	"HYT",
	"HYV",
	"HYY",
	"HZD",
	"HZK",
	"HZO",
	"IAE",
	"IAG",
	"IAI",
	"IAK",
	"IAT",
	"IBA",
	"IBI",
	"IBM",
	"IBN",
	"ICA",
	"ICB",
	"ICE",
	"ICO",
	"ICS",
	"ID",
	"IDA",
	"IDC",
	"IDE",
	"IDG",
	"IDT",
	"IDU",
	"IEI",
	"IEO",
	"IEP",
	"IEV",
	"IEX",
	"IEZ",
	"IFF",
	"IFN",
	"IGA",
	"IGD",
	"IGE",
	"IGI",
	"IGK",
	"IGM",
	"IGN",
	"IGR",
	"IGT",
	"IGV",
	"IGW",
	"IHC",
	"IHE",
	"IHF",
	"IHI",
	"IHR",
	"IHS",
	"IIC",
	"IID",
	"IIF",
	"IIM",
	"IIT",
	"IJD",
	"IJH",
	"IJJ",
	"IJK",
	"IJR",
	"IJS",
	"IJT",
	"IKJ",
	"IKL",
	"IKM",
	"IKR",
	"ILF",
	"IM",
	"IMA",
	"IMB",
	"IMC",
	"IMF",
	"IMN",
	"IMS",
	"IMT",
	"IN",
	"INB",
	"IND",
	"ING",
	"INP",
	"INT",
	"INZ",
	"IO",
	"IOC",
	"IOO",
	"IP",
	"IPG",
	"IPI",
	"IQC",
	"IQI",
	"IQM",
	"IQN",
	"IQT",
	"IR",
	"IRC",
	"IRE",
	"IRF",
	"IRL",
	"IRM",
	"IRR",
	"IRS",
	"ISF",
	"ISG",
	"ISH",
	"ISI",
	"ISM",
	"ISP",
	"IT",
	"ITA",
	"ITB",
	"ITC",
	"ITF",
	"ITG",
	"ITT",
	"ITUB",
	"ITW",
	"IVC",
	"IVE",
	"IVN",
	"IVR",
	"IVV",
	"IVW",
	"IVZ",
	"IWA",
	"IWC",
	"IX",
	"IXC",
	"IXG",
	"IXJ",
	"IXN",
	"IXP",
	"IYC",
	"IYE",
	"IYF",
	"IYG",
	"IYH",
	"IYJ",
	"IYK",
	"IYM",
	"IYR",
	"IYT",
	"IYW",
	"IYY",
	"IYZ",
	"JAG",
	"JAH",
	"JAS",
	"JBI",
	"JBJ",
	"JBK",
	"JBL",
	"JBN",
	"JBO",
	"JBR",
	"JBT",
	"JCE",
	"JCG",
	"JCI",
	"JCP",
	"JDD",
	"JEC",
	"JEF",
	"JEQ",
	"JFC",
	"JFP",
	"JFR",
	"JGG",
	"JGT",
	"JGV",
	"JHI",
	"JHP",
	"JHS",
	"JHX",
	"JKD",
	"JKE",
	"JKF",
	"JKG",
	"JKH",
	"JKI",
	"JKJ",
	"JKK",
	"JKL",
	"JLA",
	"JLL",
	"JLS",
	"JMP",
	"JNJ",
	"JNPR",
	"JNS",
	"JNY",
	"JOE",
	"JOF",
	"JPC",
	"JPG",
	"JPM",
	"JPS",
	"JPZ",
	"JQC",
	"JRN",
	"JRO",
	"JRT",
	"JSM",
	"JSN",
	"JTA",
	"JTD",
	"JTP",
	"JTX",
	"JWF",
	"JWN",
	"JXI",
	"JYN",
	"JZC",
	"JZE",
	"JZH",
	"JZJ",
	"JZK",
	"JZL",
	"JZS",
	"JZT",
	"JZV",
	"KAI",
	"KAR",
	"KB",
	"KBH",
	"KBR",
	"KBW",
	"KCC",
	"KCI",
	"KCP",
	"KCT",
	"KCW",
	"KDE",
	"KDN",
	"KED",
	"KEF",
	"KEG",
	"KEI",
	"KEP",
	"KEX",
	"KEY",
	"KF",
	"KFN",
	"KFS",
	"KFT",
	"KFY",
	"KG",
	"KGC",
	"KGS",
	"KHD",
	"KHI",
	"KID",
	"KIM",
	"KKD",
	"KLD",
	"KMB",
	"KMM",
	"KMP",
	"KMR",
	"KMT",
	"KMX",
	"KND",
	"KNL",
	"KNM",
	"KNO",
	"KNR",
	"KNX",
	"KO",
	"KOB",
	"KOF",
	"KOP",
	"KOS",
	"KR",
	"KRA",
	"KRC",
	"KRG",
	"KRH",
	"KRJ",
	"KRO",
	"KS",
	"KSA",
	"KSK",
	"KSM",
	"KSP",
	"KSS",
	"KST",
	"KSU",
	"KT",
	"KTC",
	"KTF",
	"KTH",
	"KTN",
	"KTP",
	"KTV",
	"KTX",
	"KUB",
	"KVF",
	"KVJ",
	"KVN",
	"KVR",
	"KVT",
	"KVU",
	"KVW",
	"KWK",
	"KWR",
	"KXI",
	"KYE",
	"KYN",
	"KYO",
	"L",
	"LAB",
	"LAD",
	"LAZ",
	"LBF",
	"LBY",
	"LCC",
	"LCM",
	"LDF",
	"LDK",
	"LDL",
	"LDR",
	"LEA",
	"LEE",
	"LEG",
	"LEN",
	"LEO",
	"LF",
	"LFC",
	"LFL",
	"LFT",
	"LG",
	"LGF",
	"LGI",
	"LH",
	"LHO",
	"LII",
	"LIZ",
	"LL",
	"LLL",
	"LLY",
	"LM",
	"LMI",
	"LMT",
	"LNC",
	"LNN",
	"LNT",
	"LNY",
	"LO",
	"LOR",
	"LOW",
	"LPL",
	"LPS",
	"LPX",
	"LRN",
	"LRY",
	"LSE",
	"LSI",
	"LTC",
	"LTD",
	"LTM",
	"LUB",
	"LUK",
	"LUV",
	"LUX",
	"LVB",
	"LVS",
	"LXK",
	"LXP",
	"LXU",
	"LYG",
	"LYV",
	"LZ",
	"LZB",
	"MA",
	"MAA",
	"MAC",
	"MAD",
	"MAG",
	"MAN",
	"MAR",
	"MAS",
	"MAT",
	"MAV",
	"MAY",
	"MBI",
	"MBT",
	"MCA",
	"MCD",
	"MCI",
	"MCK",
	"MCN",
	"MCO",
	"MCR",
	"MCS",
	"MCY",
	"MD",
	"MDC",
	"MDG",
	"MDP",
	"MDR",
	"MDS",
	"MDT",
	"MDU",
	"MDZ",
	"ME",
	"MED",
	"MEE",
	"MEG",
	"MEI",
	"MEN",
	"MER",
	"MET",
	"MF",
	"MFA",
	"MFB",
	"MFC",
	"MFD",
	"MFE",
	"MFG",
	"MFL",
	"MFM",
	"MFT",
	"MFV",
	"MFW",
	"MG",
	"MGA",
	"MGB",
	"MGF",
	"MGI",
	"MGM",
	"MGS",
	"MGU",
	"MHD",
	"MHF",
	"MHI",
	"MHK",
	"MHN",
	"MHO",
	"MHP",
	"MHS",
	"MHY",
	"MI",
	"MIC",
	"MIG",
	"MIL",
	"MIM",
	"MIN",
	"MIR",
	"MIY",
	"MJF",
	"MJH",
	"MJI",
	"MJN",
	"MJT",
	"MJV",
	"MJY",
	"MKC",
	"MKL",
	"MKS",
	"MKV",
	"MLG",
	"MLI",
	"MLM",
	"MLP",
	"MLR",
	"MMC",
	"MMM",
	"MMP",
	"MMR",
	"MMS",
	"MMT",
	"MMU",
	"MNE",
	"MNI",
	"MNP",
	"MO",
	"MOD",
	"MOH",
	"MON",
	"MOS",
	"MOT",
	"MOV",
	"MPA",
	"MPG",
	"MPJ",
	"MPR",
	"MPS",
	"MPV",
	"MPW",
	"MPX",
	"MQT",
	"MQY",
	"MR",
	"MRF",
	"MRH",
	"MRK",
	"MRO",
	"MRT",
	"MRX",
	"MS",
	"MSA",
	"MSB",
	"MSD",
	"MSF",
	"MSJ",
	"MSK",
	"MSM",
	"MSO",
	"MSP",
	"MSY",
	"MSZ",
	"MT",
	"MTA",
	"MTB",
	"MTD",
	"MTE",
	"MTG",
	"MTH",
	"MTL",
	"MTN",
	"MTP",
	"MTR",
	"MTS",
	"MTT",
	"MTU",
	"MTW",
	"MTX",
	"MTZ",
	"MU",
	"MUA",
	"MUC",
	"MUE",
	"MUH",
	"MUI",
	"MUJ",
	"MUR",
	"MUS",
	"MVC",
	"MVL",
	"MVO",
	"MVT",
	"MW",
	"MWA",
	"MWE",
	"MWG",
	"MWO",
	"MWR",
	"MWV",
	"MWW",
	"MXB",
	"MXE",
	"MXF",
	"MXI",
	"MXT",
	"MYC",
	"MYD",
	"MYE",
	"MYF",
	"MYI",
	"MYJ",
	"MYL",
	"MYM",
	"MYN",
	"MZF",
	"N",
	"NAC",
	"NAD",
	"NAI",
	"NAL",
	"NAN",
	"NAT",
	"NAV",
	"NAZ",
	"NBG",
	"NBL",
	"NBR",
	"NC",
	"NCA",
	"NCI",
	"NCL",
	"NCO",
	"NCP",
	"NCR",
	"NCS",
	"NCT",
	"NCV",
	"NCZ",
	"NDN",
	"NE",
	"NED",
	"NEM",
	"NEU",
	"NEV",
	"NFG",
	"NFJ",
	"NFP",
	"NFX",
	"NGG",
	"NGLS",
	"NGS",
	"NGT",
	"NGZ",
	"NHI",
	"NHP",
	"NHS",
	"NI",
	"NIE",
	"NIF",
	"NIM",
	"NIO",
	"NJ",
	"NJR",
	"NKE",
	"NL",
	"NLC",
	"NLS",
	"NLY",
	"NM",
	"NMA",
	"NMD",
	"NMI",
	"NMM",
	"NMO",
	"NMP",
	"NMR",
	"NMT",
	"NMY",
	"NNA",
	"NNC",
	"NNF",
	"NNI",
	"NNJ",
	"NNN",
	"NNP",
	"NNY",
	"NOA",
	"NOC",
	"NOK",
	"NOV",
	"NP",
	"NPC",
	"NPD",
	"NPF",
	"NPI",
	"NPK",
	"NPM",
	"NPO",
	"NPP",
	"NPT",
	"NPV",
	"NPX",
	"NPY",
	"NQC",
	"NQI",
	"NQJ",
	"NQM",
	"NQN",
	"NQP",
	"NQS",
	"NQU",
	"NR",
	"NRC",
	"NRF",
	"NRG",
	"NRN",
	"NRP",
	"NRT",
	"NRU",
	"NS",
	"NSC",
	"NSH",
	"NSL",
	"NSM",
	"NSR",
	"NST",
	"NTC",
	"NTE",
	"NTL",
	"NTT",
	"NTX",
	"NTY",
	"NTZ",
	"NU",
	"NUC",
	"NUE",
	"NUM",
	"NUN",
	"NUO",
	"NUS",
	"NUV",
	"NUW",
	"NVC",
	"NVE",
	"NVN",
	"NVO",
	"NVR",
	"NVS",
	"NWE",
	"NWK",
	"NWL",
	"NWN",
	"NWS",
	"NWY",
	"NX",
	"NXC",
	"NXN",
	"NXP",
	"NXQ",
	"NXR",
	"NXY",
	"NY",
	"NYB",
	"NYC",
	"NYM",
	"NYT",
	"NYX",
	"NZ",
	"NZT",
	"OB",
	"OC",
	"OCN",
	"OCR",
	"ODC",
	"ODP",
	"OEH",
	"OFC",
	"OFG",
	"OGE",
	"OHI",
	"OI",
	"OIA",
	"OIB",
	"OIC",
	"OII",
	"OIL",
	"OIS",
	"OKE",
	"OKS",
	"OLA",
	"OLN",
	"OLP",
	"OMC",
	"OME",
	"OMG",
	"OMI",
	"OMN",
	"OMX",
	"ONB",
	"OPY",
	"ORA",
	"ORB",
	"ORI",
	"ORN",
	"OSG",
	"OSK",
	"OSM",
	"OTE",
	"OWW",
	"OXM",
	"OXY",
	"OZM",
	"PAA",
	"PAC",
	"PAG",
	"PAI",
	"PAM",
	"PAR",
	"PAS",
	"PAY",
	"PBG",
	"PBH",
	"PBI",
	"PBR",
	"PBT",
	"PBY",
	"PC",
	"PCF",
	"PCG",
	"PCH",
	"PCK",
	"PCL",
	"PCM",
	"PCN",
	"PCP",
	"PCQ",
	"PCS",
	"PCU",
	"PCX",
	"PDA",
	"PDE",
	"PDP",
	"PDS",
	"PDT",
	"PEB",
	"PEG",
	"PEI",
	"PEO",
	"PEP",
	"PFD",
	"PFE",
	"PFG",
	"PFH",
	"PFK",
	"PFL",
	"PFN",
	"PFO",
	"PFS",
	"PFX",
	"PG",
	"PGH",
	"PGI",
	"PGM",
	"PGN",
	"PGP",
	"PGR",
	"PH",
	"PHA",
	"PHD",
	"PHG",
	"PHH",
	"PHI",
	"PHK",
	"PHM",
	"PHR",
	"PHT",
	"PHX",
	"PHY",
	"PIA",
	"PIF",
	"PII",
	"PIJ",
	"PIKE",
	"PIM",
	"PIR",
	"PIS",
	"PIY",
	"PJA",
	"PJC",
	"PJE",
	"PJI",
	"PJJ",
	"PJL",
	"PJR",
	"PJS",
	"PJT",
	"PJZ",
	"PKD",
	"PKE",
	"PKG",
	"PKH",
	"PKI",
	"PKJ",
	"PKK",
	"PKM",
	"PKO",
	"PKX",
	"PKY",
	"PL",
	"PLA",
	"PLD",
	"PLL",
	"PLP",
	"PLS",
	"PLT",
	"PLV",
	"PM",
	"PMC",
	"PMF",
	"PMG",
	"PMI",
	"PML",
	"PMM",
	"PMO",
	"PMT",
	"PMX",
	"PNC",
	"PNF",
	"PNH",
	"PNI",
	"PNK",
	"PNM",
	"PNR",
	"PNU",
	"PNW",
	"PNX",
	"PNY",
	"POH",
	"POL",
	"POM",
	"POR",
	"POT",
	"PPC",
	"PPD",
	"PPG",
	"PPL",
	"PPM",
	"PPO",
	"PPR",
	"PPS",
	"PQ",
	"PRA",
	"PRD",
	"PRE",
	"PRF",
	"PRM",
	"PRO",
	"PRS",
	"PRU",
	"PRX",
	"PSA",
	"PSB",
	"PSE",
	"PSO",
	"PSS",
	"PSW",
	"PSY",
	"PT",
	"PTC",
	"PTI",
	"PTP",
	"PTR",
	"PTV",
	"PTY",
	"PUK",
	"PVA",
	"PVD",
	"PVG",
	"PVH",
	"PVR",
	"PVX",
	"PWE",
	"PWR",
	"PX",
	"PXD",
	"PXP",
	"PYA",
	"PYB",
	"PYC",
	"PYE",
	"PYG",
	"PYI",
	"PYJ",
	"PYK",
	"PYL",
	"PYM",
	"PYN",
	"PYO",
	"PYS",
	"PYT",
	"PYV",
	"PYY",
	"PZB",
	"PZC",
	"PZE",
	"PZN",
	"QRR",
	"QTM",
	"QXM",
	"RA",
	"RAD",
	"RAH",
	"RAI",
	"RAS",
	"RAX",
	"RBA",
	"RBC",
	"RBN",
	"RBS",
	"RBV",
	"RC",
	"RCC",
	"RCI",
	"RCL",
	"RCS",
	"RDC",
	"RDK",
	"RDN",
	"RDY",
	"RE",
	"REG",
	"REP",
	"RES",
	"REV",
	"RF",
	"RFI",
	"RGA",
	"RGC",
	"RGR",
	"RGS",
	"RHB",
	"RHI",
	"RHT",
	"RIG",
	"RISK",
	"RIT",
	"RJF",
	"RKT",
	"RL",
	"RLF",
	"RLH",
	"RLI",
	"RMD",
	"RMT",
	"RNE",
	"RNP",
	"RNR",
	"ROB",
	"ROC",
	"ROG",
	"ROK",
	"ROL",
	"ROP",
	"ROS",
	"RPF",
	"RPM",
	"RPT",
	"RQI",
	"RRC",
	"RRD",
	"RRI",
	"RRR",
	"RS",
	"RSC",
	"RSG",
	"RSH",
	"RSO",
	"RST",
	"RSX",
	"RT",
	"RTI",
	"RTN",
	"RTP",
	"RTU",
	"RUK",
	"RVI",
	"RVT",
	"RWF",
	"RWT",
	"RX",
	"RXI",
	"RY",
	"RYJ",
	"RYL",
	"RYN",
	"RZ",
	"SAB",
	"SAF",
	"SAH",
	"SAI",
	"SAM",
	"SAN",
	"SAP",
	"SAY",
	"SB",
	"SBG",
	"SBH",
	"SBP",
	"SBR",
	"SBS",
	"SBW",
	"SBX",
	"SCD",
	"SCG",
	"SCI",
	"SCL",
	"SCR",
	"SCS",
	"SCU",
	"SCX",
	"SD",
	"SE",
	"SEE",
	"SEH",
	"SEL",
	"SEM",
	"SEP",
	"SF",
	"SFD",
	"SFE",
	"SFG",
	"SFI",
	"SFL",
	"SFN",
	"SFY",
	"SGA",
	"SGF",
	"SGK",
	"SGL",
	"SGU",
	"SGY",
	"SGZ",
	"SHAW",
	"SHG",
	"SHI",
	"SHO",
	"SHS",
	"SHV",
	"SHW",
	"SI",
	"SID",
	"SIG",
	"SII",
	"SJI",
	"SJM",
	"SJR",
	"SJT",
	"SJW",
	"SKH",
	"SKM",
	"SKS",
	"SKT",
	"SKX",
	"SKY",
	"SLA",
	"SLB",
	"SLE",
	"SLF",
	"SLG",
	"SLH",
	"SLM",
	"SLS",
	"SLT",
	"SLW",
	"SM",
	"SMA",
	"SMG",
	"SMI",
	"SMP",
	"SMS",
	"SNA",
	"SNE",
	"SNF",
	"SNH",
	"SNI",
	"SNN",
	"SNP",
	"SNS",
	"SNV",
	"SNX",
	"SNY",
	"SO",
	"SOA",
	"SOL",
	"SON",
	"SOR",
	"SPA",
	"SPC",
	"SPF",
	"SPG",
	"SPH",
	"SPN",
	"SPP",
	"SPR",
	"SPW",
	"SQM",
	"SR",
	"SRE",
	"SRI",
	"SRT",
	"SRV",
	"SRX",
	"SRZ",
	"SSD",
	"SSI",
	"SSL",
	"SSP",
	"SSS",
	"SSW",
	"STC",
	"STD",
	"STE",
	"STI",
	"STJ",
	"STK",
	"STL",
	"STM",
	"STN",
	"STO",
	"STP",
	"STR",
	"STRI",
	"STT",
	"STU",
	"STV",
	"STWD",
	"STX",
	"STZ",
	"SU",
	"SUG",
	"SUI",
	"SUN",
	"SUP",
	"SUR",
	"SVJ",
	"SVM",
	"SVN",
	"SVR",
	"SVU",
	"SWC",
	"SWI",
	"SWK",
	"SWM",
	"SWN",
	"SWS",
	"SWX",
	"SWY",
	"SWZ",
	"SXC",
	"SXE",
	"SXI",
	"SXL",
	"SXT",
	"SY",
	"SYA",
	"SYK",
	"SYT",
	"SYX",
	"SYY",
	"TAC",
	"TAI",
	"TAL",
	"TAM",
	"TAP",
	"TAR",
	"TBH",
	"TBI",
	"TBL",
	"TC",
	"TCB",
	"TCH",
	"TCI",
	"TCK",
	"TCL",
	"TCM",
	"TCO",
	"TD",
	"TDA",
	"TDC",
	"TDF",
	"TDG",
	"TDI",
	"TDS",
	"TDW",
	"TDY",
	"TE",
	"TEF",
	"TEG",
	"TEI",
	"TEL",
	"TEN",
	"TEO",
	"TER",
	"TEX",
	"TFC",
	"TFX",
	"TG",
	"TGH",
	"TGI",
	"TGP",
	"TGS",
	"TGT",
	"TGX",
	"THC",
	"THG",
	"THI",
	"THO",
	"THS",
	"TI",
	"TIE",
	"TIF",
	"TII",
	"TIN",
	"TIP",
	"TJX",
	"TK",
	"TKC",
	"TKF",
	"TKR",
	"TKS",
	"TLB",
	"TLH",
	"TLI",
	"TLK",
	"TLM",
	"TLP",
	"TM",
	"TMH",
	"TMK",
	"TMM",
	"TMO",
	"TMR",
	"TMS",
	"TMX",
	"TNB",
	"TNC",
	"TNE",
	"TNH",
	"TNK",
	"TNL",
	"TNP",
	"TNS",
	"TOD",
	"TOL",
	"TOO",
	"TOT",
	"TPC",
	"TPL",
	"TPX",
	"TPZ",
	"TR",
	"TRA",
	"TRC",
	"TREX",
	"TRF",
	"TRH",
	"TRI",
	"TRK",
	"TRN",
	"TRP",
	"TRR",
	"TRS",
	"TRU",
	"TRV",
	"TRW",
	"TS",
	"TSI",
	"TSL",
	"TSM",
	"TSN",
	"TSO",
	"TSP",
	"TSS",
	"TSU",
	"TTC",
	"TTF",
	"TTI",
	"TTM",
	"TTO",
	"TU",
	"TUC",
	"TUP",
	"TV",
	"TVC",
	"TVE",
	"TVL",
	"TW",
	"TWC",
	"TWI",
	"TWN",
	"TWX",
	"TX",
	"TXI",
	"TXN",
	"TXT",
	"TY",
	"TYC",
	"TYG",
	"TYL",
	"TYN",
	"TYW",
	"TYY",
	"TZF",
	"TZK",
	"UA",
	"UAM",
	"UBA",
	"UBP",
	"UBS",
	"UDR",
	"UFI",
	"UFS",
	"UGI",
	"UGP",
	"UHS",
	"UHT",
	"UIL",
	"UIS",
	"UL",
	"UMC",
	"UN",
	"UNF",
	"UNH",
	"UNM",
	"UNP",
	"UNS",
	"UNT",
	"UPL",
	"UPS",
	"URI",
	"URS",
	"USA",
	"USB",
	"USG",
	"USM",
	"UST",
	"USU",
	"UTA",
	"UTF",
	"UTI",
	"UTL",
	"UTR",
	"UTX",
	"UVV",
	"UZG",
	"UZV",
	"V",
	"VAL",
	"VALE",
	"VAR",
	"VBF",
	"VCI",
	"VCO",
	"VCV",
	"VE",
	"VFC",
	"VG",
	"VGM",
	"VGR",
	"VHI",
	"VIA",
	"VIM",
	"VIP",
	"VIT",
	"VIV",
	"VKQ",
	"VLO",
	"VLT",
	"VLY",
	"VM",
	"VMC",
	"VMI",
	"VMO",
	"VMW",
	"VNO",
	"VNOD",
	"VNR",
	"VNV",
	"VOD",
	"VOL",
	"VOQ",
	"VPV",
	"VQ",
	"VR",
	"VRS",
	"VRX",
	"VSH",
	"VSI",
	"VTA",
	"VTJ",
	"VTN",
	"VTR",
	"VVC",
	"VVI",
	"VVR",
	"VZ",
	"WAB",
	"WAG",
	"WAL",
	"WAT",
	"WBC",
	"WBD",
	"WBK",
	"WBS",
	"WCC",
	"WCG",
	"WCN",
	"WCO",
	"WDC",
	"WDR",
	"WEA",
	"WEC",
	"WEN",
	"WES",
	"WF",
	"WFC",
	"WFR",
	"WFT",
	"WG",
	"WGL",
	"WGO",
	"WH",
	"WHG",
	"WHI",
	"WHR",
	"WHX",
	"WIA",
	"WIN",
	"WIT",
	"WIW",
	"WL",
	"WLK",
	"WLL",
	"WLP",
	"WLT",
	"WM",
	"WMB",
	"WMG",
	"WMK",
	"WMS",
	"WMT",
	"WMZ",
	"WNC",
	"WNI",
	"WNR",
	"WNS",
	"WOR",
	"WPC",
	"WPI",
	"WPK",
	"WPO",
	"WPP",
	"WPS",
	"WPZ",
	"WR",
	"WRB",
	"WRC",
	"WRD",
	"WRE",
	"WRI",
	"WRS",
	"WSF",
	"WSH",
	"WSM",
	"WSO",
	"WST",
	"WTI",
	"WTM",
	"WTR",
	"WTS",
	"WTU",
	"WTW",
	"WU",
	"WW",
	"WWE",
	"WWW",
	"WWY",
	"WX",
	"WXS",
	"WY",
	"WYN",
	"XAA",
	"XCJ",
	"XCO",
	"XEC",
	"XEL",
	"XFB",
	"XFD",
	"XFH",
	"XFJ",
	"XFL",
	"XFP",
	"XFR",
	"XIN",
	"XJT",
	"XKE",
	"XKK",
	"XKN",
	"XKO",
	"XL",
	"XOM",
	"XRM",
	"XRX",
	"XTO",
	"XVF",
	"XVG",
	"YGE",
	"YPF",
	"YSI",
	"YUM",
	"YZC",
	"ZAP",
	"ZEP",
	"ZF",
	"ZLC",
	"ZMH",
	"ZNH",
	"ZNT",
	"ZQK",
	"ZTR",
	"ZZ"
];