class HungarianNotationDemo {
    constructor() {
        this.aItems = [1, 2, 3];          
        this.bIsActive = true;            
        this.iCounter = 0;               
        this.sName = "John Doe";          
        this.oConfig = {                 
            theme: "dark",
            language: "en-US"
        };
        this.vMisc = null;                
    }

    addItem(iItem) {
        this.aItems.push(iItem);
        console.log(`Item added: ${iItem}. Current items: ${this.aItems}`);
    }

    toggleActive() {
        this.bIsActive = !this.bIsActive;
        console.log(`Is Active: ${this.bIsActive}`);
    }

    updateCounter(iNewValue) {
        this.iCounter = iNewValue;
        console.log(`Counter updated to: ${this.iCounter}`);
    }

    updateName(sNewName) {
        this.sName = sNewName;
        console.log(`Name updated to: ${this.sName}`);
    }

    updateConfig(oNewConfig) {
        this.oConfig = { ...this.oConfig, ...oNewConfig };
        console.log(`Config updated to:`, this.oConfig);
    }

    setMisc(vValue) {
        this.vMisc = vValue;
        console.log(`Misc variable set to: ${this.vMisc}`);
    }
}