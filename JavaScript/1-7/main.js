class Taiyaki {
  constructor(taste){
    this.taste = taste;
  }
  nakami() {
    console.log(`中身は` + this.taste + `です`);
  }
}

let Anko = new Taiyaki(`あんこ`);
let Cream = new Taiyaki(`クリーム`);
let Cheese = new Taiyaki(`チーズ`);
Anko.nakami();
Cream.nakami();
Cheese.nakami();
