/*
Developed by Tomas Contreras at Pontificia Universidad Católica de Chile (tcontrerasc@uc.cl)

Permission is hereby granted, free of charge, to any person obtaining 
a copy of this software and associated documentation files (the 
"Software"), to deal in the Software without restriction, including 
without limitation the rights to use, copy, modify, merge, publish, 
distribute, sublicense, and/or sell copies of the Software, and to 
permit persons to whom the Software is furnished to do so, subject 
to the following conditions:

The above copyright notice and this permission notice shall be 
included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, 
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF 
MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. 
IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR 
ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF 
CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION 
WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

(MIT license, http://www.opensource.org/licenses/mit-license.html)
*/

package rars.tools;

import rars.Globals;
import rars.riscv.hardware.AccessNotice;
import rars.riscv.hardware.MemoryAccessNotice;
import rars.riscv.hardware.Memory;
import rars.riscv.hardware.InterruptController;
import rars.riscv.hardware.ControlAndStatusRegisterFile;
import rars.riscv.hardware.AddressErrorException;

/* A RARS tool used to interact with a serial device, via TX/RX ports and interrupts*/
public class SerialTool extends AbstractToolAndApplication {
    private static String heading = "Serial Tool";
    private static String version = "Version 0.1 (Tomas Contreras)";

    public SerialTool(){

    }

    public SerialTool(String title, String heading){

    }

    public static void main(String[] args){

    }

    @Override
    public String getName(){
        return "Serial Tool";
    }

    protected JComponent buildMainDisplayArea(){

    }

    // A daeomon that watches the serial interface for any changes
    private void startSerialCmpDaemon{

    }

    // Overwrites the empty parent method, called when the tool is closed
    protected void performSpecialClosingDuties() {
        stop();
    }

    // ---------- Setial Controls ----------
}