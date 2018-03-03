package com.aspose.cad.examples.ExportingCAD;

import com.aspose.cad.Image;
import com.aspose.cad.InterpolationMode;
import com.aspose.cad.SmoothingMode;
import com.aspose.cad.TextRenderingHint;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.imageoptions.BmpOptions;
import com.aspose.cad.imageoptions.CadRasterizationOptions;
import com.aspose.cad.imageoptions.PdfOptions;
import com.aspose.cad.imageoptions.TypeOfEntities;

public class ExportToBMP {

    public static void main(String[] args) {

        //ExStart:ExportToBMP
        // The path to the resource directory.
        String dataDir = Utils.getDataDir(ExportToBMP.class) + "ExportingCAD/";
        String fileName = getFileFromDesktop("APFH Floor Plan.dwf");

        com.aspose.cad.Image image = com.aspose.cad.Image.load(fileName);
        {
            BmpOptions bmpOptions = new BmpOptions();
            DwfRasterizationOptions cadRasterizationOptions = new DwfRasterizationOptions();
            bmpOptions.setVectorRasterizationOptions(cadRasterizationOptions);
            cadRasterizationOptions.setCenterDrawing(true);
            cadRasterizationOptions.setPageHeight(500);
            cadRasterizationOptions.setPageWidth(500);
            cadRasterizationOptions.setLayouts(new String[] { "Model" });
            // export
            String outPath = fileName + ".bmp";
            image.save(outPath, bmpOptions);
        }
        //ExEnd:ExportToBMP

    }
}
