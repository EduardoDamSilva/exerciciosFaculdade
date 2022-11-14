/* data-bus */
var dataBus = document.querySelectorAll(".dataBus")
for(var i = 0; i < dataBus.length; i++){
  dataBus[i].addEventListener("keyup", verificarDataBus)
}

function verificarDataBus(){
  /* Verificar se todos os campos estão preenchidos */
  var todosPreenchidos = true
  for(var j = 0; j < dataBus.length; j++){
    if(dataBus[j].value == ''){
      todosPreenchidos = false
    }
  }

  /* Mudando a cor da letra*/
  if (todosPreenchidos){

    if(dataBus[0].value != 'd' || dataBus[1].value != 'a' || dataBus[2].value != 't' || dataBus[3].value != 'a' || dataBus[4].value != '-' || dataBus[5].value != 'b' || dataBus[6].value != 'u' || dataBus[7].value != 's'){
      for(var k = 0; k < dataBus.length; k++){
        dataBus[k].classList.add("vermelho")
        dataBus[k].classList.remove("azul")
      }
    } else {
      for(var l = 0; l < dataBus.length; l++){
        dataBus[l].classList.add("azul")
        dataBus[l].classList.remove("vermelho")
      }
    }
  } else {
    for(var m = 0; m < dataBus.length; m++){
      dataBus[m].classList.remove("vermelho")
      dataBus[m].classList.remove("azul")
    }
  }

}

/* flash */
var flash = document.querySelectorAll(".flash")
for(var i = 0; i < flash.length; i++){
  flash[i].addEventListener("keyup", verificarFlash)
}

function verificarFlash(){
  var todosPreenchidos = true
  for(var j = 0; j < flash.length; j++){
    if(flash[j].value == ''){
      todosPreenchidos = false
    }
  }

  if (todosPreenchidos){

    if(flash[0].value != 's' || flash[1].value != 'f' || flash[2].value != 'l' || flash[3].value != 'a' || flash[4].value != 'h'){
      for(var k = 0; k < flash.length; k++){
        flash[k].classList.add("vermelho")
        flash[k].classList.remove("azul")
      }
    } else {
      for(var l = 0; l < flash.length; l++){
        flash[l].classList.add("azul")
        flash[l].classList.remove("vermelho")
      }
    }
  } else {
    for(var m = 0; m < flash.length; m++){
      flash[m].classList.remove("vermelho")
      flash[m].classList.remove("azul")
    }
  }

}


/* cache */
var cache = document.querySelectorAll(".cache")
for(var i = 0; i < cache.length; i++){
  cache[i].addEventListener("keyup", verificarCache)
}

function verificarCache(){
  var todosPreenchidos = true
  for(var j = 0; j < cache.length; j++){
    if(cache[j].value == ''){
      todosPreenchidos = false
    }
  }

  if (todosPreenchidos){

    if(cache[0].value != 'e' || cache[1].value != 'c' || cache[2].value != 'a' || cache[3].value != 'c' || cache[4].value != 'h'){
      for(var k = 0; k < cache.length; k++){
        cache[k].classList.add("vermelho")
        cache[k].classList.remove("azul")
      }
    } else {
      for(var l = 0; l < cache.length; l++){
        cache[l].classList.add("azul")
        cache[l].classList.remove("vermelho")
      }
    }
  } else {
    for(var m = 0; m < cache.length; m++){
      cache[m].classList.remove("vermelho")
      cache[m].classList.remove("azul")
    }
  }

}

/* eprom */
var eprom = document.querySelectorAll(".eprom")
for(var i = 0; i < eprom.length; i++){
  eprom[i].addEventListener("keyup", verificarEprom)
}

function verificarEprom(){
  var todosPreenchidos = true
  for(var j = 0; j < eprom.length; j++){
    if(eprom[j].value == ''){
      todosPreenchidos = false
    }
  }

  if (todosPreenchidos){

    if(eprom[0].value != 'r' || eprom[1].value != 'e' || eprom[2].value != 'p' || eprom[3].value != 'o' || eprom[4].value != 'm'){
      for(var k = 0; k < eprom.length; k++){
        eprom[k].classList.add("vermelho")
        eprom[k].classList.remove("azul")
      }
    } else {
      for(var l = 0; l < eprom.length; l++){
        eprom[l].classList.add("azul")
        eprom[l].classList.remove("vermelho")
      }
    }
  } else {
    for(var m = 0; m < eprom.length; m++){
      eprom[m].classList.remove("vermelho")
      eprom[m].classList.remove("azul")
    }
  }

}

/* threads */

var threads = document.querySelectorAll(".threads")
for(var i = 0; i < threads.length; i++){
  threads[i].addEventListener("keyup", verificarThreads)
}

function verificarThreads(){
  var todosPreenchidos = true
  for(var j = 0; j < threads.length; j++){
    if(threads[j].value == ''){
      todosPreenchidos = false
    }
  }

  if (todosPreenchidos){

    if(threads[0].value != 't' || threads[1].value != 'h' || threads[2].value != 'r' || threads[3].value != 'e' || threads[4].value != 'a' || threads[5].value != 'd' || threads[6].value != 's'){
      for(var k = 0; k < threads.length; k++){
        threads[k].classList.add("vermelho")
        threads[k].classList.remove("azul")
      }
    } else {
      for(var l = 0; l < threads.length; l++){
        threads[l].classList.add("azul")
        threads[l].classList.remove("vermelho")
      }
    }
  } else {
    for(var m = 0; m < threads.length; m++){
      threads[m].classList.remove("vermelho")
      threads[m].classList.remove("azul")
    }
  }

}

/* dma */

var dma = document.querySelectorAll(".dma")
for(var i = 0; i < dma.length; i++){
  dma[i].addEventListener("keyup", verificarDma)
}

function verificarDma(){
  var todosPreenchidos = true
  for(var j = 0; j < dma.length; j++){
    if(dma[j].value == ''){
      todosPreenchidos = false
    }
  }

  if (todosPreenchidos){

    if(dma[0].value != 'a' || dma[1].value != 'm' || dma[2].value != 'd'){
      for(var k = 0; k < dma.length; k++){
        dma[k].classList.add("vermelho")
        dma[k].classList.remove("azul")
      }
    } else {
      for(var l = 0; l < dma.length; l++){
        dma[l].classList.add("azul")
        dma[l].classList.remove("vermelho")
      }
    }
  } else {
    for(var m = 0; m < dma.length; m++){
      dma[m].classList.remove("vermelho")
      dma[m].classList.remove("azul")
    }
  }

}

/* memória-de-massa */

var memoriaDeMassa = document.querySelectorAll(".mdm")
for(var i = 0; i < memoriaDeMassa.length; i++){
  memoriaDeMassa[i].addEventListener("keyup", verificarMdm)
}

function verificarMdm(){
  var todosPreenchidos = true
  for(var j = 0; j < memoriaDeMassa.length; j++){
    if(memoriaDeMassa[j].value == ''){
      todosPreenchidos = false
    }
  }

  if (todosPreenchidos){

    if(memoriaDeMassa[0].value != 'd' || memoriaDeMassa[1].value != 'm' || memoriaDeMassa[2].value != 'e' || memoriaDeMassa[3].value != 'm' || memoriaDeMassa[4].value != 'ó' || memoriaDeMassa[5].value != 'r' || memoriaDeMassa[6].value != 'i' || memoriaDeMassa[7].value != 'a'|| memoriaDeMassa[8].value != '-' || memoriaDeMassa[9].value != 'e' || memoriaDeMassa[10].value != '-' || memoriaDeMassa[11].value != 'm' || memoriaDeMassa[12].value != 'a' || memoriaDeMassa[13].value != 's' || memoriaDeMassa[14].value != 's' || memoriaDeMassa[15].value != 'a'){
      for(var k = 0; k < memoriaDeMassa.length; k++){
        memoriaDeMassa[k].classList.add("vermelho")
        memoriaDeMassa[k].classList.remove("azul")
      }
    } else {
      for(var l = 0; l < memoriaDeMassa.length; l++){
        memoriaDeMassa[l].classList.add("azul")
        memoriaDeMassa[l].classList.remove("vermelho")
      }
    }
  } else {
    for(var m = 0; m < memoriaDeMassa.length; m++){
      memoriaDeMassa[m].classList.remove("vermelho")
      memoriaDeMassa[m].classList.remove("azul")
    }
  }

}

/* adress-buss */
var adressBus = document.querySelectorAll(".adressBus")
for(var i = 0; i < adressBus.length; i++){
  adressBus[i].addEventListener("keyup", verificarAdressBus)
}

function verificarAdressBus(){
  var todosPreenchidos = true
  for(var j = 0; j < adressBus.length; j++){
    if(adressBus[j].value == ''){
      todosPreenchidos = false
    }
  }

  if (todosPreenchidos){
    if(adressBus[0].value != 's' || adressBus[1].value != 'a' || adressBus[2].value != 'd' || adressBus[3].value != 'r' || adressBus[4].value != 'e' || adressBus[5].value != 's' || adressBus[6].value != '-' || adressBus[7].value != 'b'|| adressBus[8].value != 'u' || adressBus[9].value != 's'){
      for(var k = 0; k < adressBus.length; k++){
        adressBus[k].classList.add("vermelho")
        adressBus[k].classList.remove("azul")
      }
    } else {
      for(var l = 0; l < adressBus.length; l++){
        adressBus[l].classList.add("azul")
        adressBus[l].classList.remove("vermelho")
      }
    }
  } else {
    for(var m = 0; m < adressBus.length; m++){
      adressBus[m].classList.remove("vermelho")
      adressBus[m].classList.remove("azul")
    }
  }

}

/* dual-core */
var dualCore = document.querySelectorAll(".dualCore")
for(var i = 0; i < dualCore.length; i++){
  dualCore[i].addEventListener("keyup", verificarAdressBus)
}

function verificarAdressBus(){
  var todosPreenchidos = true
  for(var j = 0; j < dualCore.length; j++){
    if(dualCore[j].value == ''){
      todosPreenchidos = false
    }
  }

  if (todosPreenchidos){
    if(dualCore[0].value != 'e' || dualCore[1].value != 'd' || dualCore[2].value != 'u' || dualCore[3].value != 'a' || dualCore[4].value != 'l' || dualCore[5].value != '-' || dualCore[6].value != 'c' || dualCore[7].value != 'o'|| dualCore[8].value != 'r'){
      for(var k = 0; k < dualCore.length; k++){
        dualCore[k].classList.add("vermelho")
        dualCore[k].classList.remove("azul")
      }
    } else {
      for(var l = 0; l < dualCore.length; l++){
        dualCore[l].classList.add("azul")
        dualCore[l].classList.remove("vermelho")
      }
    }
  } else {
    for(var m = 0; m < dualCore.length; m++){
      dualCore[m].classList.remove("vermelho")
      dualCore[m].classList.remove("azul")
    }
  }

}

/* cpu */

var cpu = document.querySelectorAll(".cpu")
for(var i = 0; i < cpu.length; i++){
  cpu[i].addEventListener("keyup", verificarCpu)
}

function verificarCpu(){
  var todosPreenchidos = true
  for(var j = 0; j < cpu.length; j++){
    if(cpu[j].value == ''){
      todosPreenchidos = false
    }
  }

  if (todosPreenchidos){
    if(cpu[0].value != 'c' || cpu[1].value != 'p' || cpu[2].value != 'u'){
      for(var k = 0; k < cpu.length; k++){
        cpu[k].classList.add("vermelho")
        cpu[k].classList.remove("azul")
      }
    } else {
      for(var l = 0; l < cpu.length; l++){
        cpu[l].classList.add("azul")
        cpu[l].classList.remove("vermelho")
      }
    }
  } else {
    for(var m = 0; m < cpu.length; m++){
      cpu[m].classList.remove("vermelho")
      cpu[m].classList.remove("azul")
    }
  }

}

/* ram */
var ram = document.querySelectorAll(".ram")
for(var i = 0; i < ram.length; i++){
  ram[i].addEventListener("keyup", verificarRam)
}

function verificarRam(){
  var todosPreenchidos = true
  for(var j = 0; j < ram.length; j++){
    if(ram[j].value == ''){
      todosPreenchidos = false
    }
  }

  if (todosPreenchidos){
    if(ram[0].value != 'm' || ram[1].value != 'r' || ram[2].value != 'a'){
      for(var k = 0; k < ram.length; k++){
        ram[k].classList.add("vermelho")
        ram[k].classList.remove("azul")
      }
    } else {
      for(var l = 0; l < ram.length; l++){
        ram[l].classList.add("azul")
        ram[l].classList.remove("vermelho")
      }
    }
  } else {
    for(var m = 0; m < ram.length; m++){
      ram[m].classList.remove("vermelho")
      ram[m].classList.remove("azul")
    }
  }

}

/* i5 */
var i5 = document.querySelectorAll(".i5")
for(var i = 0; i < i5.length; i++){
  i5[i].addEventListener("keyup", verificarI5)
}

function verificarI5(){
  var todosPreenchidos = true
  for(var j = 0; j < i5.length; j++){
    if(i5[j].value == ''){
      todosPreenchidos = false
    }
  }

  if (todosPreenchidos){
    if(i5[0].value != 'i' || i5[1].value != '5'){
      for(var k = 0; k < i5.length; k++){
        i5[k].classList.add("vermelho")
        i5[k].classList.remove("azul")
      }
    } else {
      for(var l = 0; l < i5.length; l++){
        i5[l].classList.add("azul")
        i5[l].classList.remove("vermelho")
      }
    }
  } else {
    for(var m = 0; m < i5.length; m++){
      i5[m].classList.remove("vermelho")
      i5[m].classList.remove("azul")
    }
  }

}

/* i7 */

var i7 = document.querySelectorAll(".i7")
for(var i = 0; i < i7.length; i++){
  i7[i].addEventListener("keyup", verificarI7)
}

function verificarI7(){
  var todosPreenchidos = true
  for(var j = 0; j < i7.length; j++){
    if(i7[j].value == ''){
      todosPreenchidos = false
    }
  }

  if (todosPreenchidos){
    if(i7[0].value != 'i' || i7[1].value != '7'){
      for(var k = 0; k < i7.length; k++){
        i7[k].classList.add("vermelho")
        i7[k].classList.remove("azul")
      }
    } else {
      for(var l = 0; l < i7.length; l++){
        i7[l].classList.add("azul")
        i7[l].classList.remove("vermelho")
      }
    }
  } else {
    for(var m = 0; m < i7.length; m++){
      i7[m].classList.remove("vermelho")
      i7[m].classList.remove("azul")
    }
  }

}

/* quad-core */

var quadCore = document.querySelectorAll(".quadCore")
for(var i = 0; i < quadCore.length; i++){
  quadCore[i].addEventListener("keyup", verificarQuadCore)
}

function verificarQuadCore(){
  var todosPreenchidos = true
  for(var j = 0; j < quadCore.length; j++){
    if(quadCore[j].value == ''){
      todosPreenchidos = false
    }
  }

  if (todosPreenchidos){
    if(quadCore[0].value != 'r' || quadCore[1].value != 'q' || quadCore[2].value != 'u' || quadCore[3].value != 'a' || quadCore[4].value != 'd' || quadCore[5].value != '-' || quadCore[6].value != 'c' || quadCore[7].value != 'o' || quadCore[8].value != 'e'){
      for(var k = 0; k < quadCore.length; k++){
        quadCore[k].classList.add("vermelho")
        quadCore[k].classList.remove("azul")
      }
    } else {
      for(var l = 0; l < quadCore.length; l++){
        quadCore[l].classList.add("azul")
        quadCore[l].classList.remove("vermelho")
      }
    }
  } else {
    for(var m = 0; m < quadCore.length; m++){
      quadCore[m].classList.remove("vermelho")
      quadCore[m].classList.remove("azul")
    }
  }

}

/* ula */

var ula = document.querySelectorAll(".ula")
for(var i = 0; i < ula.length; i++){
  ula[i].addEventListener("keyup", verificarUla)
}

function verificarUla(){
  var todosPreenchidos = true
  for(var j = 0; j < ula.length; j++){
    if(ula[j].value == ''){
      todosPreenchidos = false
    }
  }

  if (todosPreenchidos){
    if(ula[0].value != 'u' || ula[1].value != 'l' || ula[2].value != 'a'){
      for(var k = 0; k < ula.length; k++){
        ula[k].classList.add("vermelho")
        ula[k].classList.remove("azul")
      }
    } else {
      for(var l = 0; l < ula.length; l++){
        ula[l].classList.add("azul")
        ula[l].classList.remove("vermelho")
      }
    }
  } else {
    for(var m = 0; m < ula.length; m++){
      ula[m].classList.remove("vermelho")
      ula[m].classList.remove("azul")
    }
  }

}

/* cs */
var cs = document.querySelectorAll(".cs")
for(var i = 0; i < cs.length; i++){
  cs[i].addEventListener("keyup", verificarCs)
}

function verificarCs(){
  var todosPreenchidos = true
  for(var j = 0; j < cs.length; j++){
    if(cs[j].value == ''){
      todosPreenchidos = false
    }
  }

  if (todosPreenchidos){
    if(cs[0].value != 'c' || cs[1].value != 's'){
      for(var k = 0; k < cs.length; k++){
        cs[k].classList.add("vermelho")
        cs[k].classList.remove("azul")
      }
    } else {
      for(var l = 0; l < cs.length; l++){
        cs[l].classList.add("azul")
        cs[l].classList.remove("vermelho")
      }
    }
  } else {
    for(var m = 0; m < cs.length; m++){
      cs[m].classList.remove("vermelho")
      cs[m].classList.remove("azul")
    }
  }

}

/* rom */

var rom = document.querySelectorAll(".rom")
for(var i = 0; i < rom.length; i++){
  rom[i].addEventListener("keyup", verificarRom)
}

function verificarRom(){
  var todosPreenchidos = true
  for(var j = 0; j < rom.length; j++){
    if(rom[j].value == ''){
      todosPreenchidos = false
    }
  }

  if (todosPreenchidos){
    if(rom[0].value != 'r' || rom[1].value != 'o' || rom[2].value != 'm'){
      for(var k = 0; k < rom.length; k++){
        rom[k].classList.add("vermelho")
        rom[k].classList.remove("azul")
      }
    } else {
      for(var l = 0; l < rom.length; l++){
        rom[l].classList.add("azul")
        rom[l].classList.remove("vermelho")
      }
    }
  } else {
    for(var m = 0; m < rom.length; m++){
      rom[m].classList.remove("vermelho")
      rom[m].classList.remove("azul")
    }
  }

}

/* registradores */

var registradores = document.querySelectorAll(".registradores")
for(var i = 0; i < registradores.length; i++){
  registradores[i].addEventListener("keyup", verificarRegistradores)
}

function verificarRegistradores(){
  var todosPreenchidos = true
  for(var j = 0; j < registradores.length; j++){
    if(registradores[j].value == ''){
      todosPreenchidos = false
    }
  }

  if (todosPreenchidos){
    if(registradores[0].value != 'r' || registradores[1].value != 'e' || registradores[2].value != 'g' || registradores[3].value != 'i' || registradores[4].value != 's' || registradores[5].value != 't' || registradores[6].value != 'r' || registradores[7].value != 'a' || registradores[8].value != 'd' || registradores[9].value != 'o' || registradores[10].value != 'r' || registradores[11].value != 'e' || registradores[12].value != 's'){
      for(var k = 0; k < registradores.length; k++){
        registradores[k].classList.add("vermelho")
        registradores[k].classList.remove("azul")
      }
    } else {
      for(var l = 0; l < registradores.length; l++){
        registradores[l].classList.add("azul")
        registradores[l].classList.remove("vermelho")
      }
    }
  } else {
    for(var m = 0; m < registradores.length; m++){
      registradores[m].classList.remove("vermelho")
      registradores[m].classList.remove("azul")
    }
  }

}