package com.bisratmk.salesreport;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static java.lang.String.*;

@RestController
public class SalesReportcalc {
    @RequestMapping("/BisratMKSalecalc")
    public  String SalesCalcMethod (@RequestParam("CNo")  int CNo ,
            @RequestParam("CName") String CName
            ,@RequestParam("SA") double SA ,@RequestParam("TC") int TC ){
        double TotalDue = 0.00;
        double STax = 0.00;
        switch(TC) {
            case 0:
                STax = 0.00;
                TotalDue = SA + STax;
                break;
            case 1:
                STax = SA * 0.03;
                TotalDue = SA + STax;
                break;
            case 2:
                STax = SA * 0.05;
                TotalDue = SA + STax;
                break; }

        return (CName + " "+"SalesReport <br/>" + valueOf(CNo) + "." + CName + " - Your Sales Amount $" + valueOf(SA)  +
                "  ,Your Sales Tax $" + valueOf(STax)
                + "  ,Total Due $" + valueOf(TotalDue));
    }
}







