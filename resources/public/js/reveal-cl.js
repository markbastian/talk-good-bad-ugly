if(typeof Math.imul == "undefined" || (Math.imul(0xffffffff,5) == 0)) {
    Math.imul = function (a, b) {
        var ah  = (a >>> 16) & 0xffff;
        var al = a & 0xffff;
        var bh  = (b >>> 16) & 0xffff;
        var bl = b & 0xffff;
        // the shift by 0 fixes the sign on the high part
        // the final |0 converts the unsigned value into a signed value
        return ((al * bl) + (((ah * bl + al * bh) << 16) >>> 0)|0);
    }
}


;(function(){
var f;
function u(a) {
  var b = typeof a;
  if ("object" == b) {
    if (a) {
      if (a instanceof Array) {
        return "array";
      }
      if (a instanceof Object) {
        return b;
      }
      var c = Object.prototype.toString.call(a);
      if ("[object Window]" == c) {
        return "object";
      }
      if ("[object Array]" == c || "number" == typeof a.length && "undefined" != typeof a.splice && "undefined" != typeof a.propertyIsEnumerable && !a.propertyIsEnumerable("splice")) {
        return "array";
      }
      if ("[object Function]" == c || "undefined" != typeof a.call && "undefined" != typeof a.propertyIsEnumerable && !a.propertyIsEnumerable("call")) {
        return "function";
      }
    } else {
      return "null";
    }
  } else {
    if ("function" == b && "undefined" == typeof a.call) {
      return "object";
    }
  }
  return b;
}
var aa = "closure_uid_" + (1E9 * Math.random() >>> 0), ba = 0;
function da(a) {
  return Array.prototype.join.call(arguments, "");
}
;function ea(a, b) {
  for (var c in a) {
    b.call(void 0, a[c], c, a);
  }
}
;function fa(a, b) {
  null != a && this.append.apply(this, arguments);
}
f = fa.prototype;
f.Ea = "";
f.set = function(a) {
  this.Ea = "" + a;
};
f.append = function(a, b, c) {
  this.Ea += a;
  if (null != b) {
    for (var d = 1;d < arguments.length;d++) {
      this.Ea += arguments[d];
    }
  }
  return this;
};
f.clear = function() {
  this.Ea = "";
};
f.toString = function() {
  return this.Ea;
};
if ("undefined" === typeof ga) {
  var ga = function() {
    throw Error("No *print-fn* fn set for evaluation environment");
  }
}
var ha = null;
if ("undefined" === typeof ia) {
  var ia = null
}
function la() {
  return new ma(null, 5, [oa, !0, pa, !0, ra, !1, ta, !1, ua, null], null);
}
function x(a) {
  return null != a && !1 !== a;
}
function va(a) {
  return a instanceof Array;
}
function wa(a) {
  return x(a) ? !1 : !0;
}
function z(a, b) {
  return a[u(null == b ? null : b)] ? !0 : a._ ? !0 : !1;
}
function A(a, b) {
  var c = null == b ? null : b.constructor, c = x(x(c) ? c.xb : c) ? c.wb : u(b);
  return Error(["No protocol method ", a, " defined for type ", c, ": ", b].join(""));
}
function xa(a) {
  var b = a.wb;
  return x(b) ? b : "" + C(a);
}
var Aa = "undefined" !== typeof Symbol && "function" === u(Symbol) ? Symbol.iterator : "@@iterator";
function Ba(a) {
  for (var b = a.length, c = Array(b), d = 0;;) {
    if (d < b) {
      c[d] = a[d], d += 1;
    } else {
      break;
    }
  }
  return c;
}
var Ca = {}, Da = {}, Ea = function Ea(b) {
  if (b ? b.T : b) {
    return b.T(b);
  }
  var c;
  c = Ea[u(null == b ? null : b)];
  if (!c && (c = Ea._, !c)) {
    throw A("ICounted.-count", b);
  }
  return c.call(null, b);
}, Fa = {}, Ha = function Ha(b, c) {
  if (b ? b.K : b) {
    return b.K(b, c);
  }
  var d;
  d = Ha[u(null == b ? null : b)];
  if (!d && (d = Ha._, !d)) {
    throw A("ICollection.-conj", b);
  }
  return d.call(null, b, c);
}, Ia = {}, D = function D() {
  switch(arguments.length) {
    case 2:
      return D.c(arguments[0], arguments[1]);
    case 3:
      return D.j(arguments[0], arguments[1], arguments[2]);
    default:
      throw Error([C("Invalid arity: "), C(arguments.length)].join(""));;
  }
};
D.c = function(a, b) {
  if (a ? a.H : a) {
    return a.H(a, b);
  }
  var c;
  c = D[u(null == a ? null : a)];
  if (!c && (c = D._, !c)) {
    throw A("IIndexed.-nth", a);
  }
  return c.call(null, a, b);
};
D.j = function(a, b, c) {
  if (a ? a.aa : a) {
    return a.aa(a, b, c);
  }
  var d;
  d = D[u(null == a ? null : a)];
  if (!d && (d = D._, !d)) {
    throw A("IIndexed.-nth", a);
  }
  return d.call(null, a, b, c);
};
D.X = 3;
var Ja = {}, E = function E(b) {
  if (b ? b.U : b) {
    return b.U(b);
  }
  var c;
  c = E[u(null == b ? null : b)];
  if (!c && (c = E._, !c)) {
    throw A("ISeq.-first", b);
  }
  return c.call(null, b);
}, G = function G(b) {
  if (b ? b.$ : b) {
    return b.$(b);
  }
  var c;
  c = G[u(null == b ? null : b)];
  if (!c && (c = G._, !c)) {
    throw A("ISeq.-rest", b);
  }
  return c.call(null, b);
}, Ka = {}, La = {}, H = function H() {
  switch(arguments.length) {
    case 2:
      return H.c(arguments[0], arguments[1]);
    case 3:
      return H.j(arguments[0], arguments[1], arguments[2]);
    default:
      throw Error([C("Invalid arity: "), C(arguments.length)].join(""));;
  }
};
H.c = function(a, b) {
  if (a ? a.I : a) {
    return a.I(a, b);
  }
  var c;
  c = H[u(null == a ? null : a)];
  if (!c && (c = H._, !c)) {
    throw A("ILookup.-lookup", a);
  }
  return c.call(null, a, b);
};
H.j = function(a, b, c) {
  if (a ? a.A : a) {
    return a.A(a, b, c);
  }
  var d;
  d = H[u(null == a ? null : a)];
  if (!d && (d = H._, !d)) {
    throw A("ILookup.-lookup", a);
  }
  return d.call(null, a, b, c);
};
H.X = 3;
var Na = function Na(b, c, d) {
  if (b ? b.Ka : b) {
    return b.Ka(b, c, d);
  }
  var e;
  e = Na[u(null == b ? null : b)];
  if (!e && (e = Na._, !e)) {
    throw A("IAssociative.-assoc", b);
  }
  return e.call(null, b, c, d);
}, Oa = {}, Pa = {}, Qa = function Qa(b) {
  if (b ? b.Ya : b) {
    return b.Ya();
  }
  var c;
  c = Qa[u(null == b ? null : b)];
  if (!c && (c = Qa._, !c)) {
    throw A("IMapEntry.-key", b);
  }
  return c.call(null, b);
}, Ra = function Ra(b) {
  if (b ? b.Za : b) {
    return b.Za();
  }
  var c;
  c = Ra[u(null == b ? null : b)];
  if (!c && (c = Ra._, !c)) {
    throw A("IMapEntry.-val", b);
  }
  return c.call(null, b);
}, Sa = {}, Ua = function Ua(b, c, d) {
  if (b ? b.ab : b) {
    return b.ab(b, c, d);
  }
  var e;
  e = Ua[u(null == b ? null : b)];
  if (!e && (e = Ua._, !e)) {
    throw A("IVector.-assoc-n", b);
  }
  return e.call(null, b, c, d);
}, Va = {}, Wa = function Wa(b) {
  if (b ? b.L : b) {
    return b.L(b);
  }
  var c;
  c = Wa[u(null == b ? null : b)];
  if (!c && (c = Wa._, !c)) {
    throw A("IMeta.-meta", b);
  }
  return c.call(null, b);
}, Xa = {}, Ya = function Ya(b, c) {
  if (b ? b.P : b) {
    return b.P(b, c);
  }
  var d;
  d = Ya[u(null == b ? null : b)];
  if (!d && (d = Ya._, !d)) {
    throw A("IWithMeta.-with-meta", b);
  }
  return d.call(null, b, c);
}, Za = {}, $a = function $a() {
  switch(arguments.length) {
    case 2:
      return $a.c(arguments[0], arguments[1]);
    case 3:
      return $a.j(arguments[0], arguments[1], arguments[2]);
    default:
      throw Error([C("Invalid arity: "), C(arguments.length)].join(""));;
  }
};
$a.c = function(a, b) {
  if (a ? a.N : a) {
    return a.N(a, b);
  }
  var c;
  c = $a[u(null == a ? null : a)];
  if (!c && (c = $a._, !c)) {
    throw A("IReduce.-reduce", a);
  }
  return c.call(null, a, b);
};
$a.j = function(a, b, c) {
  if (a ? a.O : a) {
    return a.O(a, b, c);
  }
  var d;
  d = $a[u(null == a ? null : a)];
  if (!d && (d = $a._, !d)) {
    throw A("IReduce.-reduce", a);
  }
  return d.call(null, a, b, c);
};
$a.X = 3;
var ab = function ab(b, c) {
  if (b ? b.o : b) {
    return b.o(b, c);
  }
  var d;
  d = ab[u(null == b ? null : b)];
  if (!d && (d = ab._, !d)) {
    throw A("IEquiv.-equiv", b);
  }
  return d.call(null, b, c);
}, bb = function bb(b) {
  if (b ? b.F : b) {
    return b.F(b);
  }
  var c;
  c = bb[u(null == b ? null : b)];
  if (!c && (c = bb._, !c)) {
    throw A("IHash.-hash", b);
  }
  return c.call(null, b);
}, cb = {}, eb = function eb(b) {
  if (b ? b.J : b) {
    return b.J(b);
  }
  var c;
  c = eb[u(null == b ? null : b)];
  if (!c && (c = eb._, !c)) {
    throw A("ISeqable.-seq", b);
  }
  return c.call(null, b);
}, fb = {}, I = function I(b, c) {
  if (b ? b.gb : b) {
    return b.gb(0, c);
  }
  var d;
  d = I[u(null == b ? null : b)];
  if (!d && (d = I._, !d)) {
    throw A("IWriter.-write", b);
  }
  return d.call(null, b, c);
}, gb = {}, hb = function hb(b, c, d) {
  if (b ? b.C : b) {
    return b.C(b, c, d);
  }
  var e;
  e = hb[u(null == b ? null : b)];
  if (!e && (e = hb._, !e)) {
    throw A("IPrintWithWriter.-pr-writer", b);
  }
  return e.call(null, b, c, d);
}, ib = function ib(b) {
  if (b ? b.Na : b) {
    return b.Na(b);
  }
  var c;
  c = ib[u(null == b ? null : b)];
  if (!c && (c = ib._, !c)) {
    throw A("IEditableCollection.-as-transient", b);
  }
  return c.call(null, b);
}, jb = function jb(b, c) {
  if (b ? b.Ra : b) {
    return b.Ra(b, c);
  }
  var d;
  d = jb[u(null == b ? null : b)];
  if (!d && (d = jb._, !d)) {
    throw A("ITransientCollection.-conj!", b);
  }
  return d.call(null, b, c);
}, kb = function kb(b) {
  if (b ? b.Sa : b) {
    return b.Sa(b);
  }
  var c;
  c = kb[u(null == b ? null : b)];
  if (!c && (c = kb._, !c)) {
    throw A("ITransientCollection.-persistent!", b);
  }
  return c.call(null, b);
}, lb = function lb(b, c, d) {
  if (b ? b.La : b) {
    return b.La(b, c, d);
  }
  var e;
  e = lb[u(null == b ? null : b)];
  if (!e && (e = lb._, !e)) {
    throw A("ITransientAssociative.-assoc!", b);
  }
  return e.call(null, b, c, d);
}, mb = function mb(b, c, d) {
  if (b ? b.fb : b) {
    return b.fb(0, c, d);
  }
  var e;
  e = mb[u(null == b ? null : b)];
  if (!e && (e = mb._, !e)) {
    throw A("ITransientVector.-assoc-n!", b);
  }
  return e.call(null, b, c, d);
}, nb = function nb(b) {
  if (b ? b.eb : b) {
    return b.eb();
  }
  var c;
  c = nb[u(null == b ? null : b)];
  if (!c && (c = nb._, !c)) {
    throw A("IChunk.-drop-first", b);
  }
  return c.call(null, b);
}, ob = function ob(b) {
  if (b ? b.Wa : b) {
    return b.Wa(b);
  }
  var c;
  c = ob[u(null == b ? null : b)];
  if (!c && (c = ob._, !c)) {
    throw A("IChunkedSeq.-chunked-first", b);
  }
  return c.call(null, b);
}, pb = function pb(b) {
  if (b ? b.Xa : b) {
    return b.Xa(b);
  }
  var c;
  c = pb[u(null == b ? null : b)];
  if (!c && (c = pb._, !c)) {
    throw A("IChunkedSeq.-chunked-rest", b);
  }
  return c.call(null, b);
}, qb = function qb(b) {
  if (b ? b.Va : b) {
    return b.Va(b);
  }
  var c;
  c = qb[u(null == b ? null : b)];
  if (!c && (c = qb._, !c)) {
    throw A("IChunkedNext.-chunked-next", b);
  }
  return c.call(null, b);
}, sb = function sb(b) {
  if (b ? b.Pa : b) {
    return b.Pa(b);
  }
  var c;
  c = sb[u(null == b ? null : b)];
  if (!c && (c = sb._, !c)) {
    throw A("IIterable.-iterator", b);
  }
  return c.call(null, b);
};
function tb(a) {
  this.yb = a;
  this.h = 1073741824;
  this.v = 0;
}
tb.prototype.gb = function(a, b) {
  return this.yb.append(b);
};
function ub(a) {
  var b = new fa;
  a.C(null, new tb(b), la());
  return "" + C(b);
}
var vb = "undefined" !== typeof Math.imul && 0 !== Math.imul(4294967295, 5) ? function(a, b) {
  return Math.imul(a, b);
} : function(a, b) {
  var c = a & 65535, d = b & 65535;
  return c * d + ((a >>> 16 & 65535) * d + c * (b >>> 16 & 65535) << 16 >>> 0) | 0;
};
function wb(a) {
  a = vb(a | 0, -862048943);
  return vb(a << 15 | a >>> -15, 461845907);
}
function xb(a, b) {
  var c = (a | 0) ^ (b | 0);
  return vb(c << 13 | c >>> -13, 5) + -430675100 | 0;
}
function yb(a, b) {
  var c = (a | 0) ^ b, c = vb(c ^ c >>> 16, -2048144789), c = vb(c ^ c >>> 13, -1028477387);
  return c ^ c >>> 16;
}
function zb(a) {
  var b;
  a: {
    b = 1;
    for (var c = 0;;) {
      if (b < a.length) {
        var d = b + 2, c = xb(c, wb(a.charCodeAt(b - 1) | a.charCodeAt(b) << 16));
        b = d;
      } else {
        b = c;
        break a;
      }
    }
  }
  b = 1 === (a.length & 1) ? b ^ wb(a.charCodeAt(a.length - 1)) : b;
  return yb(b, vb(2, a.length));
}
var Ab = {}, Bb = 0;
function Cb(a) {
  255 < Bb && (Ab = {}, Bb = 0);
  var b = Ab[a];
  if ("number" !== typeof b) {
    a: {
      if (null != a) {
        if (b = a.length, 0 < b) {
          for (var c = 0, d = 0;;) {
            if (c < b) {
              var e = c + 1, d = vb(31, d) + a.charCodeAt(c), c = e
            } else {
              b = d;
              break a;
            }
          }
        } else {
          b = 0;
        }
      } else {
        b = 0;
      }
    }
    Ab[a] = b;
    Bb += 1;
  }
  return a = b;
}
function Db(a) {
  a && (a.h & 4194304 || a.Cb) ? a = a.F(null) : "number" === typeof a ? a = Math.floor(a) % 2147483647 : !0 === a ? a = 1 : !1 === a ? a = 0 : "string" === typeof a ? (a = Cb(a), 0 !== a && (a = wb(a), a = xb(0, a), a = yb(a, 4))) : a = a instanceof Date ? a.valueOf() : null == a ? 0 : bb(a);
  return a;
}
function Eb(a, b) {
  return a ^ b + 2654435769 + (a << 6) + (a >> 2);
}
function J(a) {
  if (null == a) {
    return null;
  }
  if (a && (a.h & 8388608 || a.Db)) {
    return a.J(null);
  }
  if (va(a) || "string" === typeof a) {
    return 0 === a.length ? null : new Fb(a, 0);
  }
  if (z(cb, a)) {
    return eb(a);
  }
  throw Error([C(a), C(" is not ISeqable")].join(""));
}
function L(a) {
  if (null == a) {
    return null;
  }
  if (a && (a.h & 64 || a.$a)) {
    return a.U(null);
  }
  a = J(a);
  return null == a ? null : E(a);
}
function Gb(a) {
  return null != a ? a && (a.h & 64 || a.$a) ? a.$(null) : (a = J(a)) ? G(a) : Hb : Hb;
}
function M(a) {
  return null == a ? null : a && (a.h & 128 || a.Qa) ? a.Z(null) : J(Gb(a));
}
var N = function N() {
  switch(arguments.length) {
    case 1:
      return N.g(arguments[0]);
    case 2:
      return N.c(arguments[0], arguments[1]);
    default:
      return N.D(arguments[0], arguments[1], new Fb(Array.prototype.slice.call(arguments, 2), 0));
  }
};
N.g = function() {
  return !0;
};
N.c = function(a, b) {
  return null == a ? null == b : a === b || ab(a, b);
};
N.D = function(a, b, c) {
  for (;;) {
    if (N.c(a, b)) {
      if (M(c)) {
        a = b, b = L(c), c = M(c);
      } else {
        return N.c(b, L(c));
      }
    } else {
      return !1;
    }
  }
};
N.R = function(a) {
  var b = L(a), c = M(a);
  a = L(c);
  c = M(c);
  return N.D(b, a, c);
};
N.X = 2;
function Ib(a) {
  this.s = a;
}
Ib.prototype.next = function() {
  if (null != this.s) {
    var a = L(this.s);
    this.s = M(this.s);
    return {value:a, done:!1};
  }
  return {value:null, done:!0};
};
function O(a) {
  return new Ib(J(a));
}
function Jb(a, b) {
  var c = wb(a), c = xb(0, c);
  return yb(c, b);
}
function Kb(a) {
  var b = 0, c = 1;
  for (a = J(a);;) {
    if (null != a) {
      b += 1, c = vb(31, c) + Db(L(a)) | 0, a = M(a);
    } else {
      return Jb(c, b);
    }
  }
}
var Lb = Jb(1, 0);
function Mb(a) {
  var b = 0, c = 0;
  for (a = J(a);;) {
    if (null != a) {
      b += 1, c = c + Db(L(a)) | 0, a = M(a);
    } else {
      return Jb(c, b);
    }
  }
}
var Nb = Jb(0, 0);
Da["null"] = !0;
Ea["null"] = function() {
  return 0;
};
Date.prototype.o = function(a, b) {
  return b instanceof Date && this.valueOf() === b.valueOf();
};
ab.number = function(a, b) {
  return a === b;
};
Ca["function"] = !0;
Va["function"] = !0;
Wa["function"] = function() {
  return null;
};
bb._ = function(a) {
  return a[aa] || (a[aa] = ++ba);
};
function Ob(a, b) {
  var c = Ea(a);
  if (0 === c) {
    return b.w ? b.w() : b.call(null);
  }
  for (var d = D.c(a, 0), e = 1;;) {
    if (e < c) {
      var g = D.c(a, e), d = b.c ? b.c(d, g) : b.call(null, d, g), e = e + 1
    } else {
      return d;
    }
  }
}
function Pb(a, b, c) {
  var d = Ea(a), e = c;
  for (c = 0;;) {
    if (c < d) {
      var g = D.c(a, c), e = b.c ? b.c(e, g) : b.call(null, e, g);
      c += 1;
    } else {
      return e;
    }
  }
}
function Rb(a, b) {
  var c = a.length;
  if (0 === a.length) {
    return b.w ? b.w() : b.call(null);
  }
  for (var d = a[0], e = 1;;) {
    if (e < c) {
      var g = a[e], d = b.c ? b.c(d, g) : b.call(null, d, g), e = e + 1
    } else {
      return d;
    }
  }
}
function Sb(a, b, c) {
  var d = a.length, e = c;
  for (c = 0;;) {
    if (c < d) {
      var g = a[c], e = b.c ? b.c(e, g) : b.call(null, e, g);
      c += 1;
    } else {
      return e;
    }
  }
}
function Tb(a, b, c, d) {
  for (var e = a.length;;) {
    if (d < e) {
      var g = a[d];
      c = b.c ? b.c(c, g) : b.call(null, c, g);
      d += 1;
    } else {
      return c;
    }
  }
}
function Ub(a) {
  return a ? a.h & 2 || a.lb ? !0 : a.h ? !1 : z(Da, a) : z(Da, a);
}
function Vb(a, b) {
  this.a = a;
  this.i = b;
}
Vb.prototype.bb = function() {
  return this.i < this.a.length;
};
Vb.prototype.next = function() {
  var a = this.a[this.i];
  this.i += 1;
  return a;
};
function Fb(a, b) {
  this.a = a;
  this.i = b;
  this.h = 166199550;
  this.v = 8192;
}
f = Fb.prototype;
f.toString = function() {
  return ub(this);
};
f.equiv = function(a) {
  return this.o(null, a);
};
f.H = function(a, b) {
  var c = b + this.i;
  return c < this.a.length ? this.a[c] : null;
};
f.aa = function(a, b, c) {
  a = b + this.i;
  return a < this.a.length ? this.a[a] : c;
};
f.Pa = function() {
  return new Vb(this.a, this.i);
};
f.Z = function() {
  return this.i + 1 < this.a.length ? new Fb(this.a, this.i + 1) : null;
};
f.T = function() {
  var a = this.a.length - this.i;
  return 0 > a ? 0 : a;
};
f.F = function() {
  return Kb(this);
};
f.o = function(a, b) {
  return Wb.c ? Wb.c(this, b) : Wb.call(null, this, b);
};
f.N = function(a, b) {
  return Tb(this.a, b, this.a[this.i], this.i + 1);
};
f.O = function(a, b, c) {
  return Tb(this.a, b, c, this.i);
};
f.U = function() {
  return this.a[this.i];
};
f.$ = function() {
  return this.i + 1 < this.a.length ? new Fb(this.a, this.i + 1) : Hb;
};
f.J = function() {
  return this.i < this.a.length ? this : null;
};
f.K = function(a, b) {
  return P.c ? P.c(b, this) : P.call(null, b, this);
};
Fb.prototype[Aa] = function() {
  return O(this);
};
function Xb(a, b) {
  return b < a.length ? new Fb(a, b) : null;
}
function Yb() {
  switch(arguments.length) {
    case 1:
      return Xb(arguments[0], 0);
    case 2:
      return Xb(arguments[0], arguments[1]);
    default:
      throw Error([C("Invalid arity: "), C(arguments.length)].join(""));;
  }
}
ab._ = function(a, b) {
  return a === b;
};
var Zb = function Zb() {
  switch(arguments.length) {
    case 0:
      return Zb.w();
    case 1:
      return Zb.g(arguments[0]);
    case 2:
      return Zb.c(arguments[0], arguments[1]);
    default:
      return Zb.D(arguments[0], arguments[1], new Fb(Array.prototype.slice.call(arguments, 2), 0));
  }
};
Zb.w = function() {
  return $b;
};
Zb.g = function(a) {
  return a;
};
Zb.c = function(a, b) {
  return null != a ? Ha(a, b) : Ha(Hb, b);
};
Zb.D = function(a, b, c) {
  for (;;) {
    if (x(c)) {
      a = Zb.c(a, b), b = L(c), c = M(c);
    } else {
      return Zb.c(a, b);
    }
  }
};
Zb.R = function(a) {
  var b = L(a), c = M(a);
  a = L(c);
  c = M(c);
  return Zb.D(b, a, c);
};
Zb.X = 2;
function R(a) {
  if (null != a) {
    if (a && (a.h & 2 || a.lb)) {
      a = a.T(null);
    } else {
      if (va(a)) {
        a = a.length;
      } else {
        if ("string" === typeof a) {
          a = a.length;
        } else {
          if (z(Da, a)) {
            a = Ea(a);
          } else {
            a: {
              a = J(a);
              for (var b = 0;;) {
                if (Ub(a)) {
                  a = b + Ea(a);
                  break a;
                }
                a = M(a);
                b += 1;
              }
            }
          }
        }
      }
    }
  } else {
    a = 0;
  }
  return a;
}
function ac(a, b) {
  for (var c = null;;) {
    if (null == a) {
      return c;
    }
    if (0 === b) {
      return J(a) ? L(a) : c;
    }
    var d = a;
    if (d ? d.h & 16 || d.pb || (d.h ? 0 : z(Ia, d)) : z(Ia, d)) {
      return D.j(a, b, c);
    }
    if (J(a)) {
      var d = M(a), e = b - 1;
      a = d;
      b = e;
    } else {
      return c;
    }
  }
}
function bc(a, b) {
  if ("number" !== typeof b) {
    throw Error("index argument to nth must be a number.");
  }
  if (null == a) {
    return null;
  }
  if (a && (a.h & 16 || a.pb)) {
    return a.aa(null, b, null);
  }
  if (va(a) || "string" === typeof a) {
    return b < a.length ? a[b] : null;
  }
  if (z(Ia, a)) {
    return D.c(a, b);
  }
  if (a ? a.h & 64 || a.$a || (a.h ? 0 : z(Ja, a)) : z(Ja, a)) {
    return ac(a, b);
  }
  throw Error([C("nth not supported on this type "), C(xa(null == a ? null : a.constructor))].join(""));
}
function cc(a, b) {
  return null == a ? null : a && (a.h & 256 || a.qb) ? a.I(null, b) : va(a) ? b < a.length ? a[b | 0] : null : "string" === typeof a ? b < a.length ? a[b | 0] : null : z(La, a) ? H.c(a, b) : null;
}
function dc(a, b, c) {
  return null != a ? a && (a.h & 256 || a.qb) ? a.A(null, b, c) : va(a) ? b < a.length ? a[b] : c : "string" === typeof a ? b < a.length ? a[b] : c : z(La, a) ? H.j(a, b, c) : c : c;
}
var ec = function ec() {
  switch(arguments.length) {
    case 3:
      return ec.j(arguments[0], arguments[1], arguments[2]);
    default:
      return ec.D(arguments[0], arguments[1], arguments[2], new Fb(Array.prototype.slice.call(arguments, 3), 0));
  }
};
ec.j = function(a, b, c) {
  if (null != a) {
    a = Na(a, b, c);
  } else {
    a: {
      a = [b];
      c = [c];
      b = a.length;
      var d = 0, e;
      for (e = ib(fc);;) {
        if (d < b) {
          var g = d + 1;
          e = e.La(null, a[d], c[d]);
          d = g;
        } else {
          a = kb(e);
          break a;
        }
      }
    }
  }
  return a;
};
ec.D = function(a, b, c, d) {
  for (;;) {
    if (a = ec.j(a, b, c), x(d)) {
      b = L(d), c = L(M(d)), d = M(M(d));
    } else {
      return a;
    }
  }
};
ec.R = function(a) {
  var b = L(a), c = M(a);
  a = L(c);
  var d = M(c), c = L(d), d = M(d);
  return ec.D(b, a, c, d);
};
ec.X = 3;
function gc(a) {
  var b = "function" == u(a);
  return x(b) ? b : a ? x(x(null) ? null : a.kb) ? !0 : a.hb ? !1 : z(Ca, a) : z(Ca, a);
}
function hc(a, b) {
  this.b = a;
  this.m = b;
  this.h = 393217;
  this.v = 0;
}
f = hc.prototype;
f.L = function() {
  return this.m;
};
f.P = function(a, b) {
  return new hc(this.b, b);
};
f.kb = !0;
f.call = function() {
  function a(a, b, c, d, e, g, h, k, l, m, n, p, q, r, t, v, y, B, w, F, K, Y) {
    a = this.b;
    return ic.Oa ? ic.Oa(a, b, c, d, e, g, h, k, l, m, n, p, q, r, t, v, y, B, w, F, K, Y) : ic.call(null, a, b, c, d, e, g, h, k, l, m, n, p, q, r, t, v, y, B, w, F, K, Y);
  }
  function b(a, b, c, d, e, g, h, k, l, m, n, p, q, r, t, v, y, B, w, F, K) {
    a = this;
    return a.b.ua ? a.b.ua(b, c, d, e, g, h, k, l, m, n, p, q, r, t, v, y, B, w, F, K) : a.b.call(null, b, c, d, e, g, h, k, l, m, n, p, q, r, t, v, y, B, w, F, K);
  }
  function c(a, b, c, d, e, g, h, k, l, m, n, p, q, r, t, v, y, B, w, F) {
    a = this;
    return a.b.ta ? a.b.ta(b, c, d, e, g, h, k, l, m, n, p, q, r, t, v, y, B, w, F) : a.b.call(null, b, c, d, e, g, h, k, l, m, n, p, q, r, t, v, y, B, w, F);
  }
  function d(a, b, c, d, e, g, h, k, l, m, n, p, q, r, t, v, y, B, w) {
    a = this;
    return a.b.sa ? a.b.sa(b, c, d, e, g, h, k, l, m, n, p, q, r, t, v, y, B, w) : a.b.call(null, b, c, d, e, g, h, k, l, m, n, p, q, r, t, v, y, B, w);
  }
  function e(a, b, c, d, e, g, h, k, l, m, n, p, q, r, t, v, y, B) {
    a = this;
    return a.b.ra ? a.b.ra(b, c, d, e, g, h, k, l, m, n, p, q, r, t, v, y, B) : a.b.call(null, b, c, d, e, g, h, k, l, m, n, p, q, r, t, v, y, B);
  }
  function g(a, b, c, d, e, g, h, k, l, m, n, p, q, r, t, v, y) {
    a = this;
    return a.b.qa ? a.b.qa(b, c, d, e, g, h, k, l, m, n, p, q, r, t, v, y) : a.b.call(null, b, c, d, e, g, h, k, l, m, n, p, q, r, t, v, y);
  }
  function h(a, b, c, d, e, g, h, k, l, m, n, p, q, r, t, v) {
    a = this;
    return a.b.pa ? a.b.pa(b, c, d, e, g, h, k, l, m, n, p, q, r, t, v) : a.b.call(null, b, c, d, e, g, h, k, l, m, n, p, q, r, t, v);
  }
  function k(a, b, c, d, e, g, h, k, l, m, n, p, q, r, t) {
    a = this;
    return a.b.oa ? a.b.oa(b, c, d, e, g, h, k, l, m, n, p, q, r, t) : a.b.call(null, b, c, d, e, g, h, k, l, m, n, p, q, r, t);
  }
  function l(a, b, c, d, e, g, h, k, l, m, n, p, q, r) {
    a = this;
    return a.b.na ? a.b.na(b, c, d, e, g, h, k, l, m, n, p, q, r) : a.b.call(null, b, c, d, e, g, h, k, l, m, n, p, q, r);
  }
  function m(a, b, c, d, e, g, h, k, l, m, n, p, q) {
    a = this;
    return a.b.ma ? a.b.ma(b, c, d, e, g, h, k, l, m, n, p, q) : a.b.call(null, b, c, d, e, g, h, k, l, m, n, p, q);
  }
  function n(a, b, c, d, e, g, h, k, l, m, n, p) {
    a = this;
    return a.b.la ? a.b.la(b, c, d, e, g, h, k, l, m, n, p) : a.b.call(null, b, c, d, e, g, h, k, l, m, n, p);
  }
  function p(a, b, c, d, e, g, h, k, l, m, n) {
    a = this;
    return a.b.ka ? a.b.ka(b, c, d, e, g, h, k, l, m, n) : a.b.call(null, b, c, d, e, g, h, k, l, m, n);
  }
  function q(a, b, c, d, e, g, h, k, l, m) {
    a = this;
    return a.b.ya ? a.b.ya(b, c, d, e, g, h, k, l, m) : a.b.call(null, b, c, d, e, g, h, k, l, m);
  }
  function r(a, b, c, d, e, g, h, k, l) {
    a = this;
    return a.b.xa ? a.b.xa(b, c, d, e, g, h, k, l) : a.b.call(null, b, c, d, e, g, h, k, l);
  }
  function t(a, b, c, d, e, g, h, k) {
    a = this;
    return a.b.wa ? a.b.wa(b, c, d, e, g, h, k) : a.b.call(null, b, c, d, e, g, h, k);
  }
  function v(a, b, c, d, e, g, h) {
    a = this;
    return a.b.va ? a.b.va(b, c, d, e, g, h) : a.b.call(null, b, c, d, e, g, h);
  }
  function y(a, b, c, d, e, g) {
    a = this;
    return a.b.W ? a.b.W(b, c, d, e, g) : a.b.call(null, b, c, d, e, g);
  }
  function B(a, b, c, d, e) {
    a = this;
    return a.b.Y ? a.b.Y(b, c, d, e) : a.b.call(null, b, c, d, e);
  }
  function F(a, b, c, d) {
    a = this;
    return a.b.j ? a.b.j(b, c, d) : a.b.call(null, b, c, d);
  }
  function K(a, b, c) {
    a = this;
    return a.b.c ? a.b.c(b, c) : a.b.call(null, b, c);
  }
  function Y(a, b) {
    a = this;
    return a.b.g ? a.b.g(b) : a.b.call(null, b);
  }
  function za(a) {
    a = this;
    return a.b.w ? a.b.w() : a.b.call(null);
  }
  var w = null, w = function(w, Q, S, V, X, ca, ja, ka, na, qa, sa, ya, Ga, Ma, Ta, db, rb, Qb, mc, Jc, yd, ke) {
    switch(arguments.length) {
      case 1:
        return za.call(this, w);
      case 2:
        return Y.call(this, w, Q);
      case 3:
        return K.call(this, w, Q, S);
      case 4:
        return F.call(this, w, Q, S, V);
      case 5:
        return B.call(this, w, Q, S, V, X);
      case 6:
        return y.call(this, w, Q, S, V, X, ca);
      case 7:
        return v.call(this, w, Q, S, V, X, ca, ja);
      case 8:
        return t.call(this, w, Q, S, V, X, ca, ja, ka);
      case 9:
        return r.call(this, w, Q, S, V, X, ca, ja, ka, na);
      case 10:
        return q.call(this, w, Q, S, V, X, ca, ja, ka, na, qa);
      case 11:
        return p.call(this, w, Q, S, V, X, ca, ja, ka, na, qa, sa);
      case 12:
        return n.call(this, w, Q, S, V, X, ca, ja, ka, na, qa, sa, ya);
      case 13:
        return m.call(this, w, Q, S, V, X, ca, ja, ka, na, qa, sa, ya, Ga);
      case 14:
        return l.call(this, w, Q, S, V, X, ca, ja, ka, na, qa, sa, ya, Ga, Ma);
      case 15:
        return k.call(this, w, Q, S, V, X, ca, ja, ka, na, qa, sa, ya, Ga, Ma, Ta);
      case 16:
        return h.call(this, w, Q, S, V, X, ca, ja, ka, na, qa, sa, ya, Ga, Ma, Ta, db);
      case 17:
        return g.call(this, w, Q, S, V, X, ca, ja, ka, na, qa, sa, ya, Ga, Ma, Ta, db, rb);
      case 18:
        return e.call(this, w, Q, S, V, X, ca, ja, ka, na, qa, sa, ya, Ga, Ma, Ta, db, rb, Qb);
      case 19:
        return d.call(this, w, Q, S, V, X, ca, ja, ka, na, qa, sa, ya, Ga, Ma, Ta, db, rb, Qb, mc);
      case 20:
        return c.call(this, w, Q, S, V, X, ca, ja, ka, na, qa, sa, ya, Ga, Ma, Ta, db, rb, Qb, mc, Jc);
      case 21:
        return b.call(this, w, Q, S, V, X, ca, ja, ka, na, qa, sa, ya, Ga, Ma, Ta, db, rb, Qb, mc, Jc, yd);
      case 22:
        return a.call(this, w, Q, S, V, X, ca, ja, ka, na, qa, sa, ya, Ga, Ma, Ta, db, rb, Qb, mc, Jc, yd, ke);
    }
    throw Error("Invalid arity: " + arguments.length);
  };
  w.g = za;
  w.c = Y;
  w.j = K;
  w.Y = F;
  w.W = B;
  w.va = y;
  w.wa = v;
  w.xa = t;
  w.ya = r;
  w.ka = q;
  w.la = p;
  w.ma = n;
  w.na = m;
  w.oa = l;
  w.pa = k;
  w.qa = h;
  w.ra = g;
  w.sa = e;
  w.ta = d;
  w.ua = c;
  w.ob = b;
  w.Oa = a;
  return w;
}();
f.apply = function(a, b) {
  return this.call.apply(this, [this].concat(Ba(b)));
};
f.w = function() {
  return this.b.w ? this.b.w() : this.b.call(null);
};
f.g = function(a) {
  return this.b.g ? this.b.g(a) : this.b.call(null, a);
};
f.c = function(a, b) {
  return this.b.c ? this.b.c(a, b) : this.b.call(null, a, b);
};
f.j = function(a, b, c) {
  return this.b.j ? this.b.j(a, b, c) : this.b.call(null, a, b, c);
};
f.Y = function(a, b, c, d) {
  return this.b.Y ? this.b.Y(a, b, c, d) : this.b.call(null, a, b, c, d);
};
f.W = function(a, b, c, d, e) {
  return this.b.W ? this.b.W(a, b, c, d, e) : this.b.call(null, a, b, c, d, e);
};
f.va = function(a, b, c, d, e, g) {
  return this.b.va ? this.b.va(a, b, c, d, e, g) : this.b.call(null, a, b, c, d, e, g);
};
f.wa = function(a, b, c, d, e, g, h) {
  return this.b.wa ? this.b.wa(a, b, c, d, e, g, h) : this.b.call(null, a, b, c, d, e, g, h);
};
f.xa = function(a, b, c, d, e, g, h, k) {
  return this.b.xa ? this.b.xa(a, b, c, d, e, g, h, k) : this.b.call(null, a, b, c, d, e, g, h, k);
};
f.ya = function(a, b, c, d, e, g, h, k, l) {
  return this.b.ya ? this.b.ya(a, b, c, d, e, g, h, k, l) : this.b.call(null, a, b, c, d, e, g, h, k, l);
};
f.ka = function(a, b, c, d, e, g, h, k, l, m) {
  return this.b.ka ? this.b.ka(a, b, c, d, e, g, h, k, l, m) : this.b.call(null, a, b, c, d, e, g, h, k, l, m);
};
f.la = function(a, b, c, d, e, g, h, k, l, m, n) {
  return this.b.la ? this.b.la(a, b, c, d, e, g, h, k, l, m, n) : this.b.call(null, a, b, c, d, e, g, h, k, l, m, n);
};
f.ma = function(a, b, c, d, e, g, h, k, l, m, n, p) {
  return this.b.ma ? this.b.ma(a, b, c, d, e, g, h, k, l, m, n, p) : this.b.call(null, a, b, c, d, e, g, h, k, l, m, n, p);
};
f.na = function(a, b, c, d, e, g, h, k, l, m, n, p, q) {
  return this.b.na ? this.b.na(a, b, c, d, e, g, h, k, l, m, n, p, q) : this.b.call(null, a, b, c, d, e, g, h, k, l, m, n, p, q);
};
f.oa = function(a, b, c, d, e, g, h, k, l, m, n, p, q, r) {
  return this.b.oa ? this.b.oa(a, b, c, d, e, g, h, k, l, m, n, p, q, r) : this.b.call(null, a, b, c, d, e, g, h, k, l, m, n, p, q, r);
};
f.pa = function(a, b, c, d, e, g, h, k, l, m, n, p, q, r, t) {
  return this.b.pa ? this.b.pa(a, b, c, d, e, g, h, k, l, m, n, p, q, r, t) : this.b.call(null, a, b, c, d, e, g, h, k, l, m, n, p, q, r, t);
};
f.qa = function(a, b, c, d, e, g, h, k, l, m, n, p, q, r, t, v) {
  return this.b.qa ? this.b.qa(a, b, c, d, e, g, h, k, l, m, n, p, q, r, t, v) : this.b.call(null, a, b, c, d, e, g, h, k, l, m, n, p, q, r, t, v);
};
f.ra = function(a, b, c, d, e, g, h, k, l, m, n, p, q, r, t, v, y) {
  return this.b.ra ? this.b.ra(a, b, c, d, e, g, h, k, l, m, n, p, q, r, t, v, y) : this.b.call(null, a, b, c, d, e, g, h, k, l, m, n, p, q, r, t, v, y);
};
f.sa = function(a, b, c, d, e, g, h, k, l, m, n, p, q, r, t, v, y, B) {
  return this.b.sa ? this.b.sa(a, b, c, d, e, g, h, k, l, m, n, p, q, r, t, v, y, B) : this.b.call(null, a, b, c, d, e, g, h, k, l, m, n, p, q, r, t, v, y, B);
};
f.ta = function(a, b, c, d, e, g, h, k, l, m, n, p, q, r, t, v, y, B, F) {
  return this.b.ta ? this.b.ta(a, b, c, d, e, g, h, k, l, m, n, p, q, r, t, v, y, B, F) : this.b.call(null, a, b, c, d, e, g, h, k, l, m, n, p, q, r, t, v, y, B, F);
};
f.ua = function(a, b, c, d, e, g, h, k, l, m, n, p, q, r, t, v, y, B, F, K) {
  return this.b.ua ? this.b.ua(a, b, c, d, e, g, h, k, l, m, n, p, q, r, t, v, y, B, F, K) : this.b.call(null, a, b, c, d, e, g, h, k, l, m, n, p, q, r, t, v, y, B, F, K);
};
f.ob = function(a, b, c, d, e, g, h, k, l, m, n, p, q, r, t, v, y, B, F, K, Y) {
  var za = this.b;
  return ic.Oa ? ic.Oa(za, a, b, c, d, e, g, h, k, l, m, n, p, q, r, t, v, y, B, F, K, Y) : ic.call(null, za, a, b, c, d, e, g, h, k, l, m, n, p, q, r, t, v, y, B, F, K, Y);
};
function jc(a) {
  var b = null != a;
  return (b ? a ? a.h & 131072 || a.tb || (a.h ? 0 : z(Va, a)) : z(Va, a) : b) ? Wa(a) : null;
}
function kc(a) {
  return null == a ? !1 : a ? a.h & 1024 || a.rb ? !0 : a.h ? !1 : z(Oa, a) : z(Oa, a);
}
function lc(a) {
  return a ? a.h & 16384 || a.Fb ? !0 : a.h ? !1 : z(Sa, a) : z(Sa, a);
}
function nc(a) {
  return a ? a.v & 512 || a.zb ? !0 : !1 : !1;
}
function oc(a) {
  var b = [];
  ea(a, function(a, b) {
    return function(a, c) {
      return b.push(c);
    };
  }(a, b));
  return b;
}
function pc(a, b, c, d, e) {
  for (;0 !== e;) {
    c[d] = a[b], d += 1, --e, b += 1;
  }
}
var qc = {};
function rc(a) {
  return x(a) ? !0 : !1;
}
function sc(a, b) {
  var c = J(b);
  if (c) {
    var d = L(c), c = M(c);
    return tc ? tc(a, d, c) : uc.call(null, a, d, c);
  }
  return a.w ? a.w() : a.call(null);
}
function vc(a, b, c) {
  for (c = J(c);;) {
    if (c) {
      var d = L(c);
      b = a.c ? a.c(b, d) : a.call(null, b, d);
      c = M(c);
    } else {
      return b;
    }
  }
}
function uc() {
  switch(arguments.length) {
    case 2:
      var a = arguments[0], b = arguments[1];
      return b && (b.h & 524288 || b.vb) ? b.N(null, a) : va(b) ? Rb(b, a) : "string" === typeof b ? Rb(b, a) : z(Za, b) ? $a.c(b, a) : sc(a, b);
    case 3:
      return tc(arguments[0], arguments[1], arguments[2]);
    default:
      throw Error([C("Invalid arity: "), C(arguments.length)].join(""));;
  }
}
function tc(a, b, c) {
  return c && (c.h & 524288 || c.vb) ? c.O(null, a, b) : va(c) ? Sb(c, a, b) : "string" === typeof c ? Sb(c, a, b) : z(Za, c) ? $a.j(c, a, b) : vc(a, b, c);
}
function wc(a) {
  return a;
}
function xc(a) {
  a = (a - a % 2) / 2;
  return 0 <= a ? Math.floor(a) : Math.ceil(a);
}
function yc(a) {
  a -= a >> 1 & 1431655765;
  a = (a & 858993459) + (a >> 2 & 858993459);
  return 16843009 * (a + (a >> 4) & 252645135) >> 24;
}
var C = function C() {
  switch(arguments.length) {
    case 0:
      return C.w();
    case 1:
      return C.g(arguments[0]);
    default:
      return C.D(arguments[0], new Fb(Array.prototype.slice.call(arguments, 1), 0));
  }
};
C.w = function() {
  return "";
};
C.g = function(a) {
  return null == a ? "" : da(a);
};
C.D = function(a, b) {
  for (var c = new fa("" + C(a)), d = b;;) {
    if (x(d)) {
      c = c.append("" + C(L(d))), d = M(d);
    } else {
      return c.toString();
    }
  }
};
C.R = function(a) {
  var b = L(a);
  a = M(a);
  return C.D(b, a);
};
C.X = 1;
function Wb(a, b) {
  var c;
  if (b ? b.h & 16777216 || b.Eb || (b.h ? 0 : z(fb, b)) : z(fb, b)) {
    if (Ub(a) && Ub(b) && R(a) !== R(b)) {
      c = !1;
    } else {
      a: {
        c = J(a);
        for (var d = J(b);;) {
          if (null == c) {
            c = null == d;
            break a;
          }
          if (null != d && N.c(L(c), L(d))) {
            c = M(c), d = M(d);
          } else {
            c = !1;
            break a;
          }
        }
      }
    }
  } else {
    c = null;
  }
  return rc(c);
}
function zc(a, b, c, d, e) {
  this.m = a;
  this.first = b;
  this.za = c;
  this.count = d;
  this.l = e;
  this.h = 65937646;
  this.v = 8192;
}
f = zc.prototype;
f.toString = function() {
  return ub(this);
};
f.equiv = function(a) {
  return this.o(null, a);
};
f.L = function() {
  return this.m;
};
f.Z = function() {
  return 1 === this.count ? null : this.za;
};
f.T = function() {
  return this.count;
};
f.F = function() {
  var a = this.l;
  return null != a ? a : this.l = a = Kb(this);
};
f.o = function(a, b) {
  return Wb(this, b);
};
f.N = function(a, b) {
  return sc(b, this);
};
f.O = function(a, b, c) {
  return vc(b, c, this);
};
f.U = function() {
  return this.first;
};
f.$ = function() {
  return 1 === this.count ? Hb : this.za;
};
f.J = function() {
  return this;
};
f.P = function(a, b) {
  return new zc(b, this.first, this.za, this.count, this.l);
};
f.K = function(a, b) {
  return new zc(this.m, b, this, this.count + 1, null);
};
zc.prototype[Aa] = function() {
  return O(this);
};
function Ac(a) {
  this.m = a;
  this.h = 65937614;
  this.v = 8192;
}
f = Ac.prototype;
f.toString = function() {
  return ub(this);
};
f.equiv = function(a) {
  return this.o(null, a);
};
f.L = function() {
  return this.m;
};
f.Z = function() {
  return null;
};
f.T = function() {
  return 0;
};
f.F = function() {
  return Lb;
};
f.o = function(a, b) {
  return Wb(this, b);
};
f.N = function(a, b) {
  return sc(b, this);
};
f.O = function(a, b, c) {
  return vc(b, c, this);
};
f.U = function() {
  return null;
};
f.$ = function() {
  return Hb;
};
f.J = function() {
  return null;
};
f.P = function(a, b) {
  return new Ac(b);
};
f.K = function(a, b) {
  return new zc(this.m, b, null, 1, null);
};
var Hb = new Ac(null);
Ac.prototype[Aa] = function() {
  return O(this);
};
function Bc(a, b, c, d) {
  this.m = a;
  this.first = b;
  this.za = c;
  this.l = d;
  this.h = 65929452;
  this.v = 8192;
}
f = Bc.prototype;
f.toString = function() {
  return ub(this);
};
f.equiv = function(a) {
  return this.o(null, a);
};
f.L = function() {
  return this.m;
};
f.Z = function() {
  return null == this.za ? null : J(this.za);
};
f.F = function() {
  var a = this.l;
  return null != a ? a : this.l = a = Kb(this);
};
f.o = function(a, b) {
  return Wb(this, b);
};
f.N = function(a, b) {
  return sc(b, this);
};
f.O = function(a, b, c) {
  return vc(b, c, this);
};
f.U = function() {
  return this.first;
};
f.$ = function() {
  return null == this.za ? Hb : this.za;
};
f.J = function() {
  return this;
};
f.P = function(a, b) {
  return new Bc(b, this.first, this.za, this.l);
};
f.K = function(a, b) {
  return new Bc(null, b, this, this.l);
};
Bc.prototype[Aa] = function() {
  return O(this);
};
function P(a, b) {
  var c = null == b;
  return (c ? c : b && (b.h & 64 || b.$a)) ? new Bc(null, a, b, null) : new Bc(null, a, J(b), null);
}
function T(a, b, c, d) {
  this.ib = a;
  this.name = b;
  this.Ca = c;
  this.cb = d;
  this.h = 2153775105;
  this.v = 4096;
}
f = T.prototype;
f.toString = function() {
  return [C(":"), C(this.Ca)].join("");
};
f.equiv = function(a) {
  return this.o(null, a);
};
f.o = function(a, b) {
  return b instanceof T ? this.Ca === b.Ca : !1;
};
f.call = function() {
  var a = null, a = function(a, c, d) {
    switch(arguments.length) {
      case 2:
        return cc(c, this);
      case 3:
        return dc(c, this, d);
    }
    throw Error("Invalid arity: " + arguments.length);
  };
  a.c = function(a, c) {
    return cc(c, this);
  };
  a.j = function(a, c, d) {
    return dc(c, this, d);
  };
  return a;
}();
f.apply = function(a, b) {
  return this.call.apply(this, [this].concat(Ba(b)));
};
f.g = function(a) {
  return cc(a, this);
};
f.c = function(a, b) {
  return dc(a, this, b);
};
f.F = function() {
  var a = this.cb;
  return null != a ? a : this.cb = a = Eb(zb(this.name), Cb(this.ib)) + 2654435769 | 0;
};
f.C = function(a, b) {
  return I(b, [C(":"), C(this.Ca)].join(""));
};
var Cc = function Cc() {
  switch(arguments.length) {
    case 1:
      return Cc.g(arguments[0]);
    case 2:
      return Cc.c(arguments[0], arguments[1]);
    default:
      throw Error([C("Invalid arity: "), C(arguments.length)].join(""));;
  }
};
Cc.g = function(a) {
  var b;
  return a instanceof T ? a : "string" === typeof a ? (b = a.split("/"), 2 === b.length ? new T(b[0], b[1], a, null) : new T(null, b[0], a, null)) : null;
};
Cc.c = function(a, b) {
  return new T(a, b, [C(x(a) ? [C(a), C("/")].join("") : null), C(b)].join(""), null);
};
Cc.X = 2;
function Dc(a, b, c, d) {
  this.m = a;
  this.Ia = b;
  this.s = c;
  this.l = d;
  this.h = 32374988;
  this.v = 0;
}
f = Dc.prototype;
f.toString = function() {
  return ub(this);
};
f.equiv = function(a) {
  return this.o(null, a);
};
function Ec(a) {
  null != a.Ia && (a.s = a.Ia.w ? a.Ia.w() : a.Ia.call(null), a.Ia = null);
  return a.s;
}
f.L = function() {
  return this.m;
};
f.Z = function() {
  eb(this);
  return null == this.s ? null : M(this.s);
};
f.F = function() {
  var a = this.l;
  return null != a ? a : this.l = a = Kb(this);
};
f.o = function(a, b) {
  return Wb(this, b);
};
f.N = function(a, b) {
  return sc(b, this);
};
f.O = function(a, b, c) {
  return vc(b, c, this);
};
f.U = function() {
  eb(this);
  return null == this.s ? null : L(this.s);
};
f.$ = function() {
  eb(this);
  return null != this.s ? Gb(this.s) : Hb;
};
f.J = function() {
  Ec(this);
  if (null == this.s) {
    return null;
  }
  for (var a = this.s;;) {
    if (a instanceof Dc) {
      a = Ec(a);
    } else {
      return this.s = a, J(this.s);
    }
  }
};
f.P = function(a, b) {
  return new Dc(b, this.Ia, this.s, this.l);
};
f.K = function(a, b) {
  return P(b, this);
};
Dc.prototype[Aa] = function() {
  return O(this);
};
function Fc(a, b) {
  this.Ua = a;
  this.end = b;
  this.h = 2;
  this.v = 0;
}
Fc.prototype.add = function(a) {
  this.Ua[this.end] = a;
  return this.end += 1;
};
Fc.prototype.ja = function() {
  var a = new Gc(this.Ua, 0, this.end);
  this.Ua = null;
  return a;
};
Fc.prototype.T = function() {
  return this.end;
};
function Gc(a, b, c) {
  this.a = a;
  this.G = b;
  this.end = c;
  this.h = 524306;
  this.v = 0;
}
f = Gc.prototype;
f.T = function() {
  return this.end - this.G;
};
f.H = function(a, b) {
  return this.a[this.G + b];
};
f.aa = function(a, b, c) {
  return 0 <= b && b < this.end - this.G ? this.a[this.G + b] : c;
};
f.eb = function() {
  if (this.G === this.end) {
    throw Error("-drop-first of empty chunk");
  }
  return new Gc(this.a, this.G + 1, this.end);
};
f.N = function(a, b) {
  return Tb(this.a, b, this.a[this.G], this.G + 1);
};
f.O = function(a, b, c) {
  return Tb(this.a, b, c, this.G);
};
function Hc(a, b, c, d) {
  this.ja = a;
  this.ha = b;
  this.m = c;
  this.l = d;
  this.h = 31850732;
  this.v = 1536;
}
f = Hc.prototype;
f.toString = function() {
  return ub(this);
};
f.equiv = function(a) {
  return this.o(null, a);
};
f.L = function() {
  return this.m;
};
f.Z = function() {
  if (1 < Ea(this.ja)) {
    return new Hc(nb(this.ja), this.ha, this.m, null);
  }
  var a = eb(this.ha);
  return null == a ? null : a;
};
f.F = function() {
  var a = this.l;
  return null != a ? a : this.l = a = Kb(this);
};
f.o = function(a, b) {
  return Wb(this, b);
};
f.U = function() {
  return D.c(this.ja, 0);
};
f.$ = function() {
  return 1 < Ea(this.ja) ? new Hc(nb(this.ja), this.ha, this.m, null) : null == this.ha ? Hb : this.ha;
};
f.J = function() {
  return this;
};
f.Wa = function() {
  return this.ja;
};
f.Xa = function() {
  return null == this.ha ? Hb : this.ha;
};
f.P = function(a, b) {
  return new Hc(this.ja, this.ha, b, this.l);
};
f.K = function(a, b) {
  return P(b, this);
};
f.Va = function() {
  return null == this.ha ? null : this.ha;
};
Hc.prototype[Aa] = function() {
  return O(this);
};
function Ic(a, b) {
  return 0 === Ea(a) ? b : new Hc(a, b, null, null);
}
function Kc(a, b) {
  a.add(b);
}
function Lc(a) {
  for (var b = [];;) {
    if (J(a)) {
      b.push(L(a)), a = M(a);
    } else {
      return b;
    }
  }
}
function Mc(a, b) {
  if (Ub(a)) {
    return R(a);
  }
  for (var c = a, d = b, e = 0;;) {
    if (0 < d && J(c)) {
      c = M(c), --d, e += 1;
    } else {
      return e;
    }
  }
}
var Nc = function Nc(b) {
  return null == b ? null : null == M(b) ? J(L(b)) : P(L(b), Nc(M(b)));
};
function Oc(a, b, c) {
  var d = J(c);
  if (0 === b) {
    return a.w ? a.w() : a.call(null);
  }
  c = E(d);
  var e = G(d);
  if (1 === b) {
    return a.g ? a.g(c) : a.g ? a.g(c) : a.call(null, c);
  }
  var d = E(e), g = G(e);
  if (2 === b) {
    return a.c ? a.c(c, d) : a.c ? a.c(c, d) : a.call(null, c, d);
  }
  var e = E(g), h = G(g);
  if (3 === b) {
    return a.j ? a.j(c, d, e) : a.j ? a.j(c, d, e) : a.call(null, c, d, e);
  }
  var g = E(h), k = G(h);
  if (4 === b) {
    return a.Y ? a.Y(c, d, e, g) : a.Y ? a.Y(c, d, e, g) : a.call(null, c, d, e, g);
  }
  var h = E(k), l = G(k);
  if (5 === b) {
    return a.W ? a.W(c, d, e, g, h) : a.W ? a.W(c, d, e, g, h) : a.call(null, c, d, e, g, h);
  }
  var k = E(l), m = G(l);
  if (6 === b) {
    return a.va ? a.va(c, d, e, g, h, k) : a.va ? a.va(c, d, e, g, h, k) : a.call(null, c, d, e, g, h, k);
  }
  var l = E(m), n = G(m);
  if (7 === b) {
    return a.wa ? a.wa(c, d, e, g, h, k, l) : a.wa ? a.wa(c, d, e, g, h, k, l) : a.call(null, c, d, e, g, h, k, l);
  }
  var m = E(n), p = G(n);
  if (8 === b) {
    return a.xa ? a.xa(c, d, e, g, h, k, l, m) : a.xa ? a.xa(c, d, e, g, h, k, l, m) : a.call(null, c, d, e, g, h, k, l, m);
  }
  var n = E(p), q = G(p);
  if (9 === b) {
    return a.ya ? a.ya(c, d, e, g, h, k, l, m, n) : a.ya ? a.ya(c, d, e, g, h, k, l, m, n) : a.call(null, c, d, e, g, h, k, l, m, n);
  }
  var p = E(q), r = G(q);
  if (10 === b) {
    return a.ka ? a.ka(c, d, e, g, h, k, l, m, n, p) : a.ka ? a.ka(c, d, e, g, h, k, l, m, n, p) : a.call(null, c, d, e, g, h, k, l, m, n, p);
  }
  var q = E(r), t = G(r);
  if (11 === b) {
    return a.la ? a.la(c, d, e, g, h, k, l, m, n, p, q) : a.la ? a.la(c, d, e, g, h, k, l, m, n, p, q) : a.call(null, c, d, e, g, h, k, l, m, n, p, q);
  }
  var r = E(t), v = G(t);
  if (12 === b) {
    return a.ma ? a.ma(c, d, e, g, h, k, l, m, n, p, q, r) : a.ma ? a.ma(c, d, e, g, h, k, l, m, n, p, q, r) : a.call(null, c, d, e, g, h, k, l, m, n, p, q, r);
  }
  var t = E(v), y = G(v);
  if (13 === b) {
    return a.na ? a.na(c, d, e, g, h, k, l, m, n, p, q, r, t) : a.na ? a.na(c, d, e, g, h, k, l, m, n, p, q, r, t) : a.call(null, c, d, e, g, h, k, l, m, n, p, q, r, t);
  }
  var v = E(y), B = G(y);
  if (14 === b) {
    return a.oa ? a.oa(c, d, e, g, h, k, l, m, n, p, q, r, t, v) : a.oa ? a.oa(c, d, e, g, h, k, l, m, n, p, q, r, t, v) : a.call(null, c, d, e, g, h, k, l, m, n, p, q, r, t, v);
  }
  var y = E(B), F = G(B);
  if (15 === b) {
    return a.pa ? a.pa(c, d, e, g, h, k, l, m, n, p, q, r, t, v, y) : a.pa ? a.pa(c, d, e, g, h, k, l, m, n, p, q, r, t, v, y) : a.call(null, c, d, e, g, h, k, l, m, n, p, q, r, t, v, y);
  }
  var B = E(F), K = G(F);
  if (16 === b) {
    return a.qa ? a.qa(c, d, e, g, h, k, l, m, n, p, q, r, t, v, y, B) : a.qa ? a.qa(c, d, e, g, h, k, l, m, n, p, q, r, t, v, y, B) : a.call(null, c, d, e, g, h, k, l, m, n, p, q, r, t, v, y, B);
  }
  var F = E(K), Y = G(K);
  if (17 === b) {
    return a.ra ? a.ra(c, d, e, g, h, k, l, m, n, p, q, r, t, v, y, B, F) : a.ra ? a.ra(c, d, e, g, h, k, l, m, n, p, q, r, t, v, y, B, F) : a.call(null, c, d, e, g, h, k, l, m, n, p, q, r, t, v, y, B, F);
  }
  var K = E(Y), za = G(Y);
  if (18 === b) {
    return a.sa ? a.sa(c, d, e, g, h, k, l, m, n, p, q, r, t, v, y, B, F, K) : a.sa ? a.sa(c, d, e, g, h, k, l, m, n, p, q, r, t, v, y, B, F, K) : a.call(null, c, d, e, g, h, k, l, m, n, p, q, r, t, v, y, B, F, K);
  }
  Y = E(za);
  za = G(za);
  if (19 === b) {
    return a.ta ? a.ta(c, d, e, g, h, k, l, m, n, p, q, r, t, v, y, B, F, K, Y) : a.ta ? a.ta(c, d, e, g, h, k, l, m, n, p, q, r, t, v, y, B, F, K, Y) : a.call(null, c, d, e, g, h, k, l, m, n, p, q, r, t, v, y, B, F, K, Y);
  }
  var w = E(za);
  G(za);
  if (20 === b) {
    return a.ua ? a.ua(c, d, e, g, h, k, l, m, n, p, q, r, t, v, y, B, F, K, Y, w) : a.ua ? a.ua(c, d, e, g, h, k, l, m, n, p, q, r, t, v, y, B, F, K, Y, w) : a.call(null, c, d, e, g, h, k, l, m, n, p, q, r, t, v, y, B, F, K, Y, w);
  }
  throw Error("Only up to 20 arguments supported on functions");
}
function ic() {
  switch(arguments.length) {
    case 2:
      return Pc(arguments[0], arguments[1]);
    case 3:
      return Qc(arguments[0], arguments[1], arguments[2]);
    case 4:
      var a;
      a = arguments[0];
      var b = P(arguments[1], P(arguments[2], arguments[3])), c = a.X;
      if (a.R) {
        var d = Mc(b, c + 1);
        a = d <= c ? Oc(a, d, b) : a.R(b);
      } else {
        a = a.apply(a, Lc(b));
      }
      return a;
    case 5:
      return a = arguments[0], b = P(arguments[1], P(arguments[2], P(arguments[3], arguments[4]))), c = a.X, a.R ? (d = Mc(b, c + 1), a = d <= c ? Oc(a, d, b) : a.R(b)) : a = a.apply(a, Lc(b)), a;
    default:
      return a = arguments[0], b = P(arguments[1], P(arguments[2], P(arguments[3], P(arguments[4], Nc(new Fb(Array.prototype.slice.call(arguments, 5), 0)))))), c = a.X, a.R ? (d = Mc(b, c + 1), a = d <= c ? Oc(a, d, b) : a.R(b)) : a = a.apply(a, Lc(b)), a;
  }
}
function Pc(a, b) {
  var c = a.X;
  if (a.R) {
    var d = Mc(b, c + 1);
    return d <= c ? Oc(a, d, b) : a.R(b);
  }
  return a.apply(a, Lc(b));
}
function Qc(a, b, c) {
  b = P(b, c);
  c = a.X;
  if (a.R) {
    var d = Mc(b, c + 1);
    return d <= c ? Oc(a, d, b) : a.R(b);
  }
  return a.apply(a, Lc(b));
}
function Rc(a, b) {
  for (;;) {
    if (null == J(b)) {
      return !0;
    }
    var c;
    c = L(b);
    c = a.g ? a.g(c) : a.call(null, c);
    if (x(c)) {
      c = a;
      var d = M(b);
      a = c;
      b = d;
    } else {
      return !1;
    }
  }
}
var U = function U() {
  switch(arguments.length) {
    case 1:
      return U.g(arguments[0]);
    case 2:
      return U.c(arguments[0], arguments[1]);
    case 3:
      return U.j(arguments[0], arguments[1], arguments[2]);
    case 4:
      return U.Y(arguments[0], arguments[1], arguments[2], arguments[3]);
    default:
      return U.D(arguments[0], arguments[1], arguments[2], arguments[3], new Fb(Array.prototype.slice.call(arguments, 4), 0));
  }
};
U.g = function(a) {
  return function(b) {
    return function() {
      function c(c, d) {
        var e = a.g ? a.g(d) : a.call(null, d);
        return b.c ? b.c(c, e) : b.call(null, c, e);
      }
      function d(a) {
        return b.g ? b.g(a) : b.call(null, a);
      }
      function e() {
        return b.w ? b.w() : b.call(null);
      }
      var g = null, h = function() {
        function c(a, b, e) {
          var g = null;
          if (2 < arguments.length) {
            for (var g = 0, h = Array(arguments.length - 2);g < h.length;) {
              h[g] = arguments[g + 2], ++g;
            }
            g = new Fb(h, 0);
          }
          return d.call(this, a, b, g);
        }
        function d(c, e, g) {
          e = Qc(a, e, g);
          return b.c ? b.c(c, e) : b.call(null, c, e);
        }
        c.X = 2;
        c.R = function(a) {
          var b = L(a);
          a = M(a);
          var c = L(a);
          a = Gb(a);
          return d(b, c, a);
        };
        c.D = d;
        return c;
      }(), g = function(a, b, g) {
        switch(arguments.length) {
          case 0:
            return e.call(this);
          case 1:
            return d.call(this, a);
          case 2:
            return c.call(this, a, b);
          default:
            var n = null;
            if (2 < arguments.length) {
              for (var n = 0, p = Array(arguments.length - 2);n < p.length;) {
                p[n] = arguments[n + 2], ++n;
              }
              n = new Fb(p, 0);
            }
            return h.D(a, b, n);
        }
        throw Error("Invalid arity: " + arguments.length);
      };
      g.X = 2;
      g.R = h.R;
      g.w = e;
      g.g = d;
      g.c = c;
      g.D = h.D;
      return g;
    }();
  };
};
U.c = function(a, b) {
  return new Dc(null, function() {
    var c = J(b);
    if (c) {
      if (nc(c)) {
        for (var d = ob(c), e = R(d), g = new Fc(Array(e), 0), h = 0;;) {
          if (h < e) {
            Kc(g, function() {
              var b = D.c(d, h);
              return a.g ? a.g(b) : a.call(null, b);
            }()), h += 1;
          } else {
            break;
          }
        }
        return Ic(g.ja(), U.c(a, pb(c)));
      }
      return P(function() {
        var b = L(c);
        return a.g ? a.g(b) : a.call(null, b);
      }(), U.c(a, Gb(c)));
    }
    return null;
  }, null, null);
};
U.j = function(a, b, c) {
  return new Dc(null, function() {
    var d = J(b), e = J(c);
    if (d && e) {
      var g = P, h;
      h = L(d);
      var k = L(e);
      h = a.c ? a.c(h, k) : a.call(null, h, k);
      d = g(h, U.j(a, Gb(d), Gb(e)));
    } else {
      d = null;
    }
    return d;
  }, null, null);
};
U.Y = function(a, b, c, d) {
  return new Dc(null, function() {
    var e = J(b), g = J(c), h = J(d);
    if (e && g && h) {
      var k = P, l;
      l = L(e);
      var m = L(g), n = L(h);
      l = a.j ? a.j(l, m, n) : a.call(null, l, m, n);
      e = k(l, U.Y(a, Gb(e), Gb(g), Gb(h)));
    } else {
      e = null;
    }
    return e;
  }, null, null);
};
U.D = function(a, b, c, d, e) {
  var g = function k(a) {
    return new Dc(null, function() {
      var b = U.c(J, a);
      return Rc(wc, b) ? P(U.c(L, b), k(U.c(Gb, b))) : null;
    }, null, null);
  };
  return U.c(function() {
    return function(b) {
      return Pc(a, b);
    };
  }(g), g(Zb.D(e, d, Yb([c, b], 0))));
};
U.R = function(a) {
  var b = L(a), c = M(a);
  a = L(c);
  var d = M(c), c = L(d), e = M(d), d = L(e), e = M(e);
  return U.D(b, a, c, d, e);
};
U.X = 4;
function Sc(a, b) {
  this.u = a;
  this.a = b;
}
function Tc(a) {
  return new Sc(a, [null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]);
}
function Uc(a) {
  a = a.f;
  return 32 > a ? 0 : a - 1 >>> 5 << 5;
}
function Vc(a, b, c) {
  for (;;) {
    if (0 === b) {
      return c;
    }
    var d = Tc(a);
    d.a[0] = c;
    c = d;
    b -= 5;
  }
}
var Wc = function Wc(b, c, d, e) {
  var g = new Sc(d.u, Ba(d.a)), h = b.f - 1 >>> c & 31;
  5 === c ? g.a[h] = e : (d = d.a[h], b = null != d ? Wc(b, c - 5, d, e) : Vc(null, c - 5, e), g.a[h] = b);
  return g;
};
function Xc(a, b) {
  throw Error([C("No item "), C(a), C(" in vector of length "), C(b)].join(""));
}
function Yc(a, b) {
  if (b >= Uc(a)) {
    return a.V;
  }
  for (var c = a.root, d = a.shift;;) {
    if (0 < d) {
      var e = d - 5, c = c.a[b >>> d & 31], d = e
    } else {
      return c.a;
    }
  }
}
function Zc(a, b) {
  return 0 <= b && b < a.f ? Yc(a, b) : Xc(b, a.f);
}
var $c = function $c(b, c, d, e, g) {
  var h = new Sc(d.u, Ba(d.a));
  if (0 === c) {
    h.a[e & 31] = g;
  } else {
    var k = e >>> c & 31;
    b = $c(b, c - 5, d.a[k], e, g);
    h.a[k] = b;
  }
  return h;
};
function ad(a, b, c, d, e, g) {
  this.i = a;
  this.Ta = b;
  this.a = c;
  this.Aa = d;
  this.start = e;
  this.end = g;
}
ad.prototype.bb = function() {
  return this.i < this.end;
};
ad.prototype.next = function() {
  32 === this.i - this.Ta && (this.a = Yc(this.Aa, this.i), this.Ta += 32);
  var a = this.a[this.i & 31];
  this.i += 1;
  return a;
};
function W(a, b, c, d, e, g) {
  this.m = a;
  this.f = b;
  this.shift = c;
  this.root = d;
  this.V = e;
  this.l = g;
  this.h = 167668511;
  this.v = 8196;
}
f = W.prototype;
f.toString = function() {
  return ub(this);
};
f.equiv = function(a) {
  return this.o(null, a);
};
f.I = function(a, b) {
  return H.j(this, b, null);
};
f.A = function(a, b, c) {
  return "number" === typeof b ? D.j(this, b, c) : c;
};
f.H = function(a, b) {
  return Zc(this, b)[b & 31];
};
f.aa = function(a, b, c) {
  return 0 <= b && b < this.f ? Yc(this, b)[b & 31] : c;
};
f.ab = function(a, b, c) {
  if (0 <= b && b < this.f) {
    return Uc(this) <= b ? (a = Ba(this.V), a[b & 31] = c, new W(this.m, this.f, this.shift, this.root, a, null)) : new W(this.m, this.f, this.shift, $c(this, this.shift, this.root, b, c), this.V, null);
  }
  if (b === this.f) {
    return Ha(this, c);
  }
  throw Error([C("Index "), C(b), C(" out of bounds  [0,"), C(this.f), C("]")].join(""));
};
f.Pa = function() {
  var a = this.f;
  return new ad(0, 0, 0 < R(this) ? Yc(this, 0) : null, this, 0, a);
};
f.L = function() {
  return this.m;
};
f.T = function() {
  return this.f;
};
f.Ya = function() {
  return D.c(this, 0);
};
f.Za = function() {
  return D.c(this, 1);
};
f.F = function() {
  var a = this.l;
  return null != a ? a : this.l = a = Kb(this);
};
f.o = function(a, b) {
  if (b instanceof W) {
    if (this.f === R(b)) {
      for (var c = sb(this), d = sb(b);;) {
        if (x(c.bb())) {
          var e = c.next(), g = d.next();
          if (!N.c(e, g)) {
            return !1;
          }
        } else {
          return !0;
        }
      }
    } else {
      return !1;
    }
  } else {
    return Wb(this, b);
  }
};
f.Na = function() {
  var a = this;
  return new bd(a.f, a.shift, function() {
    var b = a.root;
    return cd.g ? cd.g(b) : cd.call(null, b);
  }(), function() {
    var b = a.V;
    return dd.g ? dd.g(b) : dd.call(null, b);
  }());
};
f.N = function(a, b) {
  return Ob(this, b);
};
f.O = function(a, b, c) {
  a = 0;
  for (var d = c;;) {
    if (a < this.f) {
      var e = Yc(this, a);
      c = e.length;
      a: {
        for (var g = 0;;) {
          if (g < c) {
            var h = e[g], d = b.c ? b.c(d, h) : b.call(null, d, h), g = g + 1
          } else {
            e = d;
            break a;
          }
        }
      }
      a += c;
      d = e;
    } else {
      return d;
    }
  }
};
f.Ka = function(a, b, c) {
  if ("number" === typeof b) {
    return Ua(this, b, c);
  }
  throw Error("Vector's key for assoc must be a number.");
};
f.J = function() {
  if (0 === this.f) {
    return null;
  }
  if (32 >= this.f) {
    return new Fb(this.V, 0);
  }
  var a;
  a: {
    a = this.root;
    for (var b = this.shift;;) {
      if (0 < b) {
        b -= 5, a = a.a[0];
      } else {
        a = a.a;
        break a;
      }
    }
  }
  return ed ? ed(this, a, 0, 0) : fd.call(null, this, a, 0, 0);
};
f.P = function(a, b) {
  return new W(b, this.f, this.shift, this.root, this.V, this.l);
};
f.K = function(a, b) {
  if (32 > this.f - Uc(this)) {
    for (var c = this.V.length, d = Array(c + 1), e = 0;;) {
      if (e < c) {
        d[e] = this.V[e], e += 1;
      } else {
        break;
      }
    }
    d[c] = b;
    return new W(this.m, this.f + 1, this.shift, this.root, d, null);
  }
  c = (d = this.f >>> 5 > 1 << this.shift) ? this.shift + 5 : this.shift;
  d ? (d = Tc(null), d.a[0] = this.root, e = Vc(null, this.shift, new Sc(null, this.V)), d.a[1] = e) : d = Wc(this, this.shift, this.root, new Sc(null, this.V));
  return new W(this.m, this.f + 1, c, d, [b], null);
};
f.call = function() {
  var a = null, a = function(a, c, d) {
    switch(arguments.length) {
      case 2:
        return this.H(null, c);
      case 3:
        return this.aa(null, c, d);
    }
    throw Error("Invalid arity: " + arguments.length);
  };
  a.c = function(a, c) {
    return this.H(null, c);
  };
  a.j = function(a, c, d) {
    return this.aa(null, c, d);
  };
  return a;
}();
f.apply = function(a, b) {
  return this.call.apply(this, [this].concat(Ba(b)));
};
f.g = function(a) {
  return this.H(null, a);
};
f.c = function(a, b) {
  return this.aa(null, a, b);
};
var gd = new Sc(null, [null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]), $b = new W(null, 0, 5, gd, [], Lb);
W.prototype[Aa] = function() {
  return O(this);
};
function hd(a, b, c, d, e, g) {
  this.ca = a;
  this.node = b;
  this.i = c;
  this.G = d;
  this.m = e;
  this.l = g;
  this.h = 32375020;
  this.v = 1536;
}
f = hd.prototype;
f.toString = function() {
  return ub(this);
};
f.equiv = function(a) {
  return this.o(null, a);
};
f.L = function() {
  return this.m;
};
f.Z = function() {
  if (this.G + 1 < this.node.length) {
    var a;
    a = this.ca;
    var b = this.node, c = this.i, d = this.G + 1;
    a = ed ? ed(a, b, c, d) : fd.call(null, a, b, c, d);
    return null == a ? null : a;
  }
  return qb(this);
};
f.F = function() {
  var a = this.l;
  return null != a ? a : this.l = a = Kb(this);
};
f.o = function(a, b) {
  return Wb(this, b);
};
f.N = function(a, b) {
  var c;
  c = this.ca;
  var d = this.i + this.G, e = R(this.ca);
  c = id ? id(c, d, e) : jd.call(null, c, d, e);
  return Ob(c, b);
};
f.O = function(a, b, c) {
  a = this.ca;
  var d = this.i + this.G, e = R(this.ca);
  a = id ? id(a, d, e) : jd.call(null, a, d, e);
  return Pb(a, b, c);
};
f.U = function() {
  return this.node[this.G];
};
f.$ = function() {
  if (this.G + 1 < this.node.length) {
    var a;
    a = this.ca;
    var b = this.node, c = this.i, d = this.G + 1;
    a = ed ? ed(a, b, c, d) : fd.call(null, a, b, c, d);
    return null == a ? Hb : a;
  }
  return pb(this);
};
f.J = function() {
  return this;
};
f.Wa = function() {
  var a = this.node;
  return new Gc(a, this.G, a.length);
};
f.Xa = function() {
  var a = this.i + this.node.length;
  if (a < Ea(this.ca)) {
    var b = this.ca, c = Yc(this.ca, a);
    return ed ? ed(b, c, a, 0) : fd.call(null, b, c, a, 0);
  }
  return Hb;
};
f.P = function(a, b) {
  var c = this.ca, d = this.node, e = this.i, g = this.G;
  return kd ? kd(c, d, e, g, b) : fd.call(null, c, d, e, g, b);
};
f.K = function(a, b) {
  return P(b, this);
};
f.Va = function() {
  var a = this.i + this.node.length;
  if (a < Ea(this.ca)) {
    var b = this.ca, c = Yc(this.ca, a);
    return ed ? ed(b, c, a, 0) : fd.call(null, b, c, a, 0);
  }
  return null;
};
hd.prototype[Aa] = function() {
  return O(this);
};
function fd() {
  switch(arguments.length) {
    case 3:
      var a = arguments[0], b = arguments[1], c = arguments[2];
      return new hd(a, Zc(a, b), b, c, null, null);
    case 4:
      return ed(arguments[0], arguments[1], arguments[2], arguments[3]);
    case 5:
      return kd(arguments[0], arguments[1], arguments[2], arguments[3], arguments[4]);
    default:
      throw Error([C("Invalid arity: "), C(arguments.length)].join(""));;
  }
}
function ed(a, b, c, d) {
  return new hd(a, b, c, d, null, null);
}
function kd(a, b, c, d, e) {
  return new hd(a, b, c, d, e, null);
}
function ld(a, b, c, d, e) {
  this.m = a;
  this.Aa = b;
  this.start = c;
  this.end = d;
  this.l = e;
  this.h = 167666463;
  this.v = 8192;
}
f = ld.prototype;
f.toString = function() {
  return ub(this);
};
f.equiv = function(a) {
  return this.o(null, a);
};
f.I = function(a, b) {
  return H.j(this, b, null);
};
f.A = function(a, b, c) {
  return "number" === typeof b ? D.j(this, b, c) : c;
};
f.H = function(a, b) {
  return 0 > b || this.end <= this.start + b ? Xc(b, this.end - this.start) : D.c(this.Aa, this.start + b);
};
f.aa = function(a, b, c) {
  return 0 > b || this.end <= this.start + b ? c : D.j(this.Aa, this.start + b, c);
};
f.ab = function(a, b, c) {
  var d = this.start + b;
  a = this.m;
  c = ec.j(this.Aa, d, c);
  b = this.start;
  var e = this.end, d = d + 1, d = e > d ? e : d;
  return md.W ? md.W(a, c, b, d, null) : md.call(null, a, c, b, d, null);
};
f.L = function() {
  return this.m;
};
f.T = function() {
  return this.end - this.start;
};
f.F = function() {
  var a = this.l;
  return null != a ? a : this.l = a = Kb(this);
};
f.o = function(a, b) {
  return Wb(this, b);
};
f.N = function(a, b) {
  return Ob(this, b);
};
f.O = function(a, b, c) {
  return Pb(this, b, c);
};
f.Ka = function(a, b, c) {
  if ("number" === typeof b) {
    return Ua(this, b, c);
  }
  throw Error("Subvec's key for assoc must be a number.");
};
f.J = function() {
  var a = this;
  return function(b) {
    return function d(e) {
      return e === a.end ? null : P(D.c(a.Aa, e), new Dc(null, function() {
        return function() {
          return d(e + 1);
        };
      }(b), null, null));
    };
  }(this)(a.start);
};
f.P = function(a, b) {
  var c = this.Aa, d = this.start, e = this.end, g = this.l;
  return md.W ? md.W(b, c, d, e, g) : md.call(null, b, c, d, e, g);
};
f.K = function(a, b) {
  var c = this.m, d = Ua(this.Aa, this.end, b), e = this.start, g = this.end + 1;
  return md.W ? md.W(c, d, e, g, null) : md.call(null, c, d, e, g, null);
};
f.call = function() {
  var a = null, a = function(a, c, d) {
    switch(arguments.length) {
      case 2:
        return this.H(null, c);
      case 3:
        return this.aa(null, c, d);
    }
    throw Error("Invalid arity: " + arguments.length);
  };
  a.c = function(a, c) {
    return this.H(null, c);
  };
  a.j = function(a, c, d) {
    return this.aa(null, c, d);
  };
  return a;
}();
f.apply = function(a, b) {
  return this.call.apply(this, [this].concat(Ba(b)));
};
f.g = function(a) {
  return this.H(null, a);
};
f.c = function(a, b) {
  return this.aa(null, a, b);
};
ld.prototype[Aa] = function() {
  return O(this);
};
function md(a, b, c, d, e) {
  for (;;) {
    if (b instanceof ld) {
      c = b.start + c, d = b.start + d, b = b.Aa;
    } else {
      var g = R(b);
      if (0 > c || 0 > d || c > g || d > g) {
        throw Error("Index out of bounds");
      }
      return new ld(a, b, c, d, e);
    }
  }
}
function jd() {
  switch(arguments.length) {
    case 2:
      var a = arguments[0];
      return id(a, arguments[1], R(a));
    case 3:
      return id(arguments[0], arguments[1], arguments[2]);
    default:
      throw Error([C("Invalid arity: "), C(arguments.length)].join(""));;
  }
}
function id(a, b, c) {
  return md(null, a, b, c, null);
}
function nd(a, b) {
  return a === b.u ? b : new Sc(a, Ba(b.a));
}
function cd(a) {
  return new Sc({}, Ba(a.a));
}
function dd(a) {
  var b = [null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null];
  pc(a, 0, b, 0, a.length);
  return b;
}
var od = function od(b, c, d, e) {
  d = nd(b.root.u, d);
  var g = b.f - 1 >>> c & 31;
  if (5 === c) {
    b = e;
  } else {
    var h = d.a[g];
    b = null != h ? od(b, c - 5, h, e) : Vc(b.root.u, c - 5, e);
  }
  d.a[g] = b;
  return d;
};
function bd(a, b, c, d) {
  this.f = a;
  this.shift = b;
  this.root = c;
  this.V = d;
  this.v = 88;
  this.h = 275;
}
f = bd.prototype;
f.Ra = function(a, b) {
  if (this.root.u) {
    if (32 > this.f - Uc(this)) {
      this.V[this.f & 31] = b;
    } else {
      var c = new Sc(this.root.u, this.V), d = [null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null];
      d[0] = b;
      this.V = d;
      if (this.f >>> 5 > 1 << this.shift) {
        var d = [null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null], e = this.shift + 5;
        d[0] = this.root;
        d[1] = Vc(this.root.u, this.shift, c);
        this.root = new Sc(this.root.u, d);
        this.shift = e;
      } else {
        this.root = od(this, this.shift, this.root, c);
      }
    }
    this.f += 1;
    return this;
  }
  throw Error("conj! after persistent!");
};
f.Sa = function() {
  if (this.root.u) {
    this.root.u = null;
    var a = this.f - Uc(this), b = Array(a);
    pc(this.V, 0, b, 0, a);
    return new W(null, this.f, this.shift, this.root, b, null);
  }
  throw Error("persistent! called twice");
};
f.La = function(a, b, c) {
  if ("number" === typeof b) {
    return mb(this, b, c);
  }
  throw Error("TransientVector's key for assoc! must be a number.");
};
f.fb = function(a, b, c) {
  var d = this;
  if (d.root.u) {
    if (0 <= b && b < d.f) {
      return Uc(this) <= b ? d.V[b & 31] = c : (a = function() {
        return function g(a, k) {
          var l = nd(d.root.u, k);
          if (0 === a) {
            l.a[b & 31] = c;
          } else {
            var m = b >>> a & 31, n = g(a - 5, l.a[m]);
            l.a[m] = n;
          }
          return l;
        };
      }(this).call(null, d.shift, d.root), d.root = a), this;
    }
    if (b === d.f) {
      return jb(this, c);
    }
    throw Error([C("Index "), C(b), C(" out of bounds for TransientVector of length"), C(d.f)].join(""));
  }
  throw Error("assoc! after persistent!");
};
f.T = function() {
  if (this.root.u) {
    return this.f;
  }
  throw Error("count after persistent!");
};
f.H = function(a, b) {
  if (this.root.u) {
    return Zc(this, b)[b & 31];
  }
  throw Error("nth after persistent!");
};
f.aa = function(a, b, c) {
  return 0 <= b && b < this.f ? D.c(this, b) : c;
};
f.I = function(a, b) {
  return H.j(this, b, null);
};
f.A = function(a, b, c) {
  return "number" === typeof b ? D.j(this, b, c) : c;
};
f.call = function() {
  var a = null, a = function(a, c, d) {
    switch(arguments.length) {
      case 2:
        return this.I(null, c);
      case 3:
        return this.A(null, c, d);
    }
    throw Error("Invalid arity: " + arguments.length);
  };
  a.c = function(a, c) {
    return this.I(null, c);
  };
  a.j = function(a, c, d) {
    return this.A(null, c, d);
  };
  return a;
}();
f.apply = function(a, b) {
  return this.call.apply(this, [this].concat(Ba(b)));
};
f.g = function(a) {
  return this.I(null, a);
};
f.c = function(a, b) {
  return this.A(null, a, b);
};
function pd() {
  this.h = 2097152;
  this.v = 0;
}
pd.prototype.equiv = function(a) {
  return this.o(null, a);
};
pd.prototype.o = function() {
  return !1;
};
var qd = new pd;
function rd(a, b) {
  return rc(kc(b) ? R(a) === R(b) ? Rc(wc, U.c(function(a) {
    return N.c(dc(b, L(a), qd), L(M(a)));
  }, a)) : null : null);
}
function sd(a) {
  this.s = a;
}
sd.prototype.next = function() {
  if (null != this.s) {
    var a = L(this.s), b = bc(a, 0), a = bc(a, 1);
    this.s = M(this.s);
    return {value:[b, a], done:!1};
  }
  return {value:null, done:!0};
};
function td(a) {
  return new sd(J(a));
}
function ud(a, b) {
  var c;
  if (b instanceof T) {
    a: {
      c = a.length;
      for (var d = b.Ca, e = 0;;) {
        if (c <= e) {
          c = -1;
          break a;
        }
        var g = a[e];
        if (g instanceof T && d === g.Ca) {
          c = e;
          break a;
        }
        e += 2;
      }
    }
  } else {
    if (c = "string" == typeof b, x(x(c) ? c : "number" === typeof b)) {
      a: {
        for (c = a.length, d = 0;;) {
          if (c <= d) {
            c = -1;
            break a;
          }
          if (b === a[d]) {
            c = d;
            break a;
          }
          d += 2;
        }
      }
    } else {
      if (null == b) {
        a: {
          for (c = a.length, d = 0;;) {
            if (c <= d) {
              c = -1;
              break a;
            }
            if (null == a[d]) {
              c = d;
              break a;
            }
            d += 2;
          }
        }
      } else {
        a: {
          for (c = a.length, d = 0;;) {
            if (c <= d) {
              c = -1;
              break a;
            }
            if (N.c(b, a[d])) {
              c = d;
              break a;
            }
            d += 2;
          }
        }
      }
    }
  }
  return c;
}
function vd(a, b, c) {
  this.a = a;
  this.i = b;
  this.ea = c;
  this.h = 32374990;
  this.v = 0;
}
f = vd.prototype;
f.toString = function() {
  return ub(this);
};
f.equiv = function(a) {
  return this.o(null, a);
};
f.L = function() {
  return this.ea;
};
f.Z = function() {
  return this.i < this.a.length - 2 ? new vd(this.a, this.i + 2, this.ea) : null;
};
f.T = function() {
  return (this.a.length - this.i) / 2;
};
f.F = function() {
  return Kb(this);
};
f.o = function(a, b) {
  return Wb(this, b);
};
f.N = function(a, b) {
  return sc(b, this);
};
f.O = function(a, b, c) {
  return vc(b, c, this);
};
f.U = function() {
  return new W(null, 2, 5, gd, [this.a[this.i], this.a[this.i + 1]], null);
};
f.$ = function() {
  return this.i < this.a.length - 2 ? new vd(this.a, this.i + 2, this.ea) : Hb;
};
f.J = function() {
  return this;
};
f.P = function(a, b) {
  return new vd(this.a, this.i, b);
};
f.K = function(a, b) {
  return P(b, this);
};
vd.prototype[Aa] = function() {
  return O(this);
};
function wd(a, b, c) {
  this.a = a;
  this.i = b;
  this.f = c;
}
wd.prototype.bb = function() {
  return this.i < this.f;
};
wd.prototype.next = function() {
  var a = new W(null, 2, 5, gd, [this.a[this.i], this.a[this.i + 1]], null);
  this.i += 2;
  return a;
};
function ma(a, b, c, d) {
  this.m = a;
  this.f = b;
  this.a = c;
  this.l = d;
  this.h = 16647951;
  this.v = 8196;
}
f = ma.prototype;
f.toString = function() {
  return ub(this);
};
f.equiv = function(a) {
  return this.o(null, a);
};
f.keys = function() {
  return O(xd.g ? xd.g(this) : xd.call(null, this));
};
f.entries = function() {
  return td(J(this));
};
f.values = function() {
  return O(zd.g ? zd.g(this) : zd.call(null, this));
};
f.has = function(a) {
  return dc(this, a, qc) === qc ? !1 : !0;
};
f.get = function(a, b) {
  return this.A(null, a, b);
};
f.forEach = function(a) {
  for (var b = J(this), c = null, d = 0, e = 0;;) {
    if (e < d) {
      var g = c.H(null, e), h = bc(g, 0), g = bc(g, 1);
      a.c ? a.c(g, h) : a.call(null, g, h);
      e += 1;
    } else {
      if (b = J(b)) {
        nc(b) ? (c = ob(b), b = pb(b), h = c, d = R(c), c = h) : (c = L(b), h = bc(c, 0), c = g = bc(c, 1), a.c ? a.c(c, h) : a.call(null, c, h), b = M(b), c = null, d = 0), e = 0;
      } else {
        return null;
      }
    }
  }
};
f.I = function(a, b) {
  return H.j(this, b, null);
};
f.A = function(a, b, c) {
  a = ud(this.a, b);
  return -1 === a ? c : this.a[a + 1];
};
f.Pa = function() {
  return new wd(this.a, 0, 2 * this.f);
};
f.L = function() {
  return this.m;
};
f.T = function() {
  return this.f;
};
f.F = function() {
  var a = this.l;
  return null != a ? a : this.l = a = Mb(this);
};
f.o = function(a, b) {
  if (b && (b.h & 1024 || b.rb)) {
    var c = this.a.length;
    if (this.f === b.T(null)) {
      for (var d = 0;;) {
        if (d < c) {
          var e = b.A(null, this.a[d], qc);
          if (e !== qc) {
            if (N.c(this.a[d + 1], e)) {
              d += 2;
            } else {
              return !1;
            }
          } else {
            return !1;
          }
        } else {
          return !0;
        }
      }
    } else {
      return !1;
    }
  } else {
    return rd(this, b);
  }
};
f.Na = function() {
  return new Ad({}, this.a.length, Ba(this.a));
};
f.N = function(a, b) {
  return sc(b, this);
};
f.O = function(a, b, c) {
  return vc(b, c, this);
};
f.Ka = function(a, b, c) {
  a = ud(this.a, b);
  if (-1 === a) {
    if (this.f < Bd) {
      a = this.a;
      for (var d = a.length, e = Array(d + 2), g = 0;;) {
        if (g < d) {
          e[g] = a[g], g += 1;
        } else {
          break;
        }
      }
      e[d] = b;
      e[d + 1] = c;
      return new ma(this.m, this.f + 1, e, null);
    }
    a = fc;
    null != a ? a && (a.v & 4 || a.Bb) ? (d = tc(jb, ib(a), this), d = kb(d), a = jc(a), a = gc(d) && !(d ? d.h & 262144 || d.Gb || (d.h ? 0 : z(Xa, d)) : z(Xa, d)) ? new hc(d, a) : null == d ? null : Ya(d, a)) : a = tc(Ha, a, this) : a = tc(Zb, Hb, this);
    return Ya(Na(a, b, c), this.m);
  }
  if (c === this.a[a + 1]) {
    return this;
  }
  b = Ba(this.a);
  b[a + 1] = c;
  return new ma(this.m, this.f, b, null);
};
f.J = function() {
  var a = this.a;
  return 0 <= a.length - 2 ? new vd(a, 0, null) : null;
};
f.P = function(a, b) {
  return new ma(b, this.f, this.a, this.l);
};
f.K = function(a, b) {
  if (lc(b)) {
    return Na(this, D.c(b, 0), D.c(b, 1));
  }
  for (var c = this, d = J(b);;) {
    if (null == d) {
      return c;
    }
    var e = L(d);
    if (lc(e)) {
      c = Na(c, D.c(e, 0), D.c(e, 1)), d = M(d);
    } else {
      throw Error("conj on a map takes map entries or seqables of map entries");
    }
  }
};
f.call = function() {
  var a = null, a = function(a, c, d) {
    switch(arguments.length) {
      case 2:
        return this.I(null, c);
      case 3:
        return this.A(null, c, d);
    }
    throw Error("Invalid arity: " + arguments.length);
  };
  a.c = function(a, c) {
    return this.I(null, c);
  };
  a.j = function(a, c, d) {
    return this.A(null, c, d);
  };
  return a;
}();
f.apply = function(a, b) {
  return this.call.apply(this, [this].concat(Ba(b)));
};
f.g = function(a) {
  return this.I(null, a);
};
f.c = function(a, b) {
  return this.A(null, a, b);
};
var Bd = 8;
ma.prototype[Aa] = function() {
  return O(this);
};
function Ad(a, b, c) {
  this.Ha = a;
  this.Ja = b;
  this.a = c;
  this.h = 258;
  this.v = 56;
}
f = Ad.prototype;
f.T = function() {
  if (x(this.Ha)) {
    return xc(this.Ja);
  }
  throw Error("count after persistent!");
};
f.I = function(a, b) {
  return H.j(this, b, null);
};
f.A = function(a, b, c) {
  if (x(this.Ha)) {
    return a = ud(this.a, b), -1 === a ? c : this.a[a + 1];
  }
  throw Error("lookup after persistent!");
};
f.Ra = function(a, b) {
  if (x(this.Ha)) {
    if (b ? b.h & 2048 || b.sb || (b.h ? 0 : z(Pa, b)) : z(Pa, b)) {
      return lb(this, Cd.g ? Cd.g(b) : Cd.call(null, b), Dd.g ? Dd.g(b) : Dd.call(null, b));
    }
    for (var c = J(b), d = this;;) {
      var e = L(c);
      if (x(e)) {
        var g = e, c = M(c), d = lb(d, function() {
          var a = g;
          return Cd.g ? Cd.g(a) : Cd.call(null, a);
        }(), function() {
          var a = g;
          return Dd.g ? Dd.g(a) : Dd.call(null, a);
        }())
      } else {
        return d;
      }
    }
  } else {
    throw Error("conj! after persistent!");
  }
};
f.Sa = function() {
  if (x(this.Ha)) {
    return this.Ha = !1, new ma(null, xc(this.Ja), this.a, null);
  }
  throw Error("persistent! called twice");
};
f.La = function(a, b, c) {
  if (x(this.Ha)) {
    a = ud(this.a, b);
    if (-1 === a) {
      if (this.Ja + 2 <= 2 * Bd) {
        return this.Ja += 2, this.a.push(b), this.a.push(c), this;
      }
      a = this.Ja;
      var d = this.a;
      a = Ed.c ? Ed.c(a, d) : Ed.call(null, a, d);
      return lb(a, b, c);
    }
    c !== this.a[a + 1] && (this.a[a + 1] = c);
    return this;
  }
  throw Error("assoc! after persistent!");
};
function Ed(a, b) {
  for (var c = ib(fc), d = 0;;) {
    if (d < a) {
      c = lb(c, b[d], b[d + 1]), d += 2;
    } else {
      return c;
    }
  }
}
function Fd() {
  this.ia = !1;
}
function Gd(a, b) {
  return a === b ? !0 : a === b || a instanceof T && b instanceof T && a.Ca === b.Ca ? !0 : N.c(a, b);
}
function Hd(a, b, c) {
  a = Ba(a);
  a[b] = c;
  return a;
}
function Id(a, b, c, d) {
  a = a.Fa(b);
  a.a[c] = d;
  return a;
}
function Jd(a, b, c) {
  this.u = a;
  this.B = b;
  this.a = c;
}
f = Jd.prototype;
f.Fa = function(a) {
  if (a === this.u) {
    return this;
  }
  var b = yc(this.B), c = Array(0 > b ? 4 : 2 * (b + 1));
  pc(this.a, 0, c, 0, 2 * b);
  return new Jd(a, this.B, c);
};
f.Ma = function() {
  var a = this.a;
  return Kd ? Kd(a) : Ld.call(null, a);
};
f.Ga = function(a, b, c, d) {
  var e = 1 << (b >>> a & 31);
  if (0 === (this.B & e)) {
    return d;
  }
  var g = yc(this.B & e - 1), e = this.a[2 * g], g = this.a[2 * g + 1];
  return null == e ? g.Ga(a + 5, b, c, d) : Gd(c, e) ? g : d;
};
f.ga = function(a, b, c, d, e, g) {
  var h = 1 << (c >>> b & 31), k = yc(this.B & h - 1);
  if (0 === (this.B & h)) {
    var l = yc(this.B);
    if (2 * l < this.a.length) {
      a = this.Fa(a);
      b = a.a;
      g.ia = !0;
      a: {
        for (c = 2 * (l - k), g = 2 * k + (c - 1), l = 2 * (k + 1) + (c - 1);;) {
          if (0 === c) {
            break a;
          }
          b[l] = b[g];
          --l;
          --c;
          --g;
        }
      }
      b[2 * k] = d;
      b[2 * k + 1] = e;
      a.B |= h;
      return a;
    }
    if (16 <= l) {
      k = [null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null];
      k[c >>> b & 31] = Md.ga(a, b + 5, c, d, e, g);
      for (e = d = 0;;) {
        if (32 > d) {
          0 !== (this.B >>> d & 1) && (k[d] = null != this.a[e] ? Md.ga(a, b + 5, Db(this.a[e]), this.a[e], this.a[e + 1], g) : this.a[e + 1], e += 2), d += 1;
        } else {
          break;
        }
      }
      return new Nd(a, l + 1, k);
    }
    b = Array(2 * (l + 4));
    pc(this.a, 0, b, 0, 2 * k);
    b[2 * k] = d;
    b[2 * k + 1] = e;
    pc(this.a, 2 * k, b, 2 * (k + 1), 2 * (l - k));
    g.ia = !0;
    a = this.Fa(a);
    a.a = b;
    a.B |= h;
    return a;
  }
  l = this.a[2 * k];
  h = this.a[2 * k + 1];
  if (null == l) {
    return l = h.ga(a, b + 5, c, d, e, g), l === h ? this : Id(this, a, 2 * k + 1, l);
  }
  if (Gd(d, l)) {
    return e === h ? this : Id(this, a, 2 * k + 1, e);
  }
  g.ia = !0;
  g = b + 5;
  d = Od ? Od(a, g, l, h, c, d, e) : Pd.call(null, a, g, l, h, c, d, e);
  e = 2 * k;
  k = 2 * k + 1;
  a = this.Fa(a);
  a.a[e] = null;
  a.a[k] = d;
  return a;
};
f.fa = function(a, b, c, d, e) {
  var g = 1 << (b >>> a & 31), h = yc(this.B & g - 1);
  if (0 === (this.B & g)) {
    var k = yc(this.B);
    if (16 <= k) {
      h = [null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null];
      h[b >>> a & 31] = Md.fa(a + 5, b, c, d, e);
      for (d = c = 0;;) {
        if (32 > c) {
          0 !== (this.B >>> c & 1) && (h[c] = null != this.a[d] ? Md.fa(a + 5, Db(this.a[d]), this.a[d], this.a[d + 1], e) : this.a[d + 1], d += 2), c += 1;
        } else {
          break;
        }
      }
      return new Nd(null, k + 1, h);
    }
    a = Array(2 * (k + 1));
    pc(this.a, 0, a, 0, 2 * h);
    a[2 * h] = c;
    a[2 * h + 1] = d;
    pc(this.a, 2 * h, a, 2 * (h + 1), 2 * (k - h));
    e.ia = !0;
    return new Jd(null, this.B | g, a);
  }
  var l = this.a[2 * h], g = this.a[2 * h + 1];
  if (null == l) {
    return k = g.fa(a + 5, b, c, d, e), k === g ? this : new Jd(null, this.B, Hd(this.a, 2 * h + 1, k));
  }
  if (Gd(c, l)) {
    return d === g ? this : new Jd(null, this.B, Hd(this.a, 2 * h + 1, d));
  }
  e.ia = !0;
  e = this.B;
  k = this.a;
  a += 5;
  a = Qd ? Qd(a, l, g, b, c, d) : Pd.call(null, a, l, g, b, c, d);
  c = 2 * h;
  h = 2 * h + 1;
  d = Ba(k);
  d[c] = null;
  d[h] = a;
  return new Jd(null, e, d);
};
var Md = new Jd(null, 0, []);
function Nd(a, b, c) {
  this.u = a;
  this.f = b;
  this.a = c;
}
f = Nd.prototype;
f.Fa = function(a) {
  return a === this.u ? this : new Nd(a, this.f, Ba(this.a));
};
f.Ma = function() {
  var a = this.a;
  return Rd ? Rd(a) : Sd.call(null, a);
};
f.Ga = function(a, b, c, d) {
  var e = this.a[b >>> a & 31];
  return null != e ? e.Ga(a + 5, b, c, d) : d;
};
f.ga = function(a, b, c, d, e, g) {
  var h = c >>> b & 31, k = this.a[h];
  if (null == k) {
    return a = Id(this, a, h, Md.ga(a, b + 5, c, d, e, g)), a.f += 1, a;
  }
  b = k.ga(a, b + 5, c, d, e, g);
  return b === k ? this : Id(this, a, h, b);
};
f.fa = function(a, b, c, d, e) {
  var g = b >>> a & 31, h = this.a[g];
  if (null == h) {
    return new Nd(null, this.f + 1, Hd(this.a, g, Md.fa(a + 5, b, c, d, e)));
  }
  a = h.fa(a + 5, b, c, d, e);
  return a === h ? this : new Nd(null, this.f, Hd(this.a, g, a));
};
function Td(a, b, c) {
  b *= 2;
  for (var d = 0;;) {
    if (d < b) {
      if (Gd(c, a[d])) {
        return d;
      }
      d += 2;
    } else {
      return -1;
    }
  }
}
function Ud(a, b, c, d) {
  this.u = a;
  this.Ba = b;
  this.f = c;
  this.a = d;
}
f = Ud.prototype;
f.Fa = function(a) {
  if (a === this.u) {
    return this;
  }
  var b = Array(2 * (this.f + 1));
  pc(this.a, 0, b, 0, 2 * this.f);
  return new Ud(a, this.Ba, this.f, b);
};
f.Ma = function() {
  var a = this.a;
  return Kd ? Kd(a) : Ld.call(null, a);
};
f.Ga = function(a, b, c, d) {
  a = Td(this.a, this.f, c);
  return 0 > a ? d : Gd(c, this.a[a]) ? this.a[a + 1] : d;
};
f.ga = function(a, b, c, d, e, g) {
  if (c === this.Ba) {
    b = Td(this.a, this.f, d);
    if (-1 === b) {
      if (this.a.length > 2 * this.f) {
        return b = 2 * this.f, c = 2 * this.f + 1, a = this.Fa(a), a.a[b] = d, a.a[c] = e, g.ia = !0, a.f += 1, a;
      }
      c = this.a.length;
      b = Array(c + 2);
      pc(this.a, 0, b, 0, c);
      b[c] = d;
      b[c + 1] = e;
      g.ia = !0;
      d = this.f + 1;
      a === this.u ? (this.a = b, this.f = d, a = this) : a = new Ud(this.u, this.Ba, d, b);
      return a;
    }
    return this.a[b + 1] === e ? this : Id(this, a, b + 1, e);
  }
  return (new Jd(a, 1 << (this.Ba >>> b & 31), [null, this, null, null])).ga(a, b, c, d, e, g);
};
f.fa = function(a, b, c, d, e) {
  return b === this.Ba ? (a = Td(this.a, this.f, c), -1 === a ? (a = 2 * this.f, b = Array(a + 2), pc(this.a, 0, b, 0, a), b[a] = c, b[a + 1] = d, e.ia = !0, new Ud(null, this.Ba, this.f + 1, b)) : N.c(this.a[a], d) ? this : new Ud(null, this.Ba, this.f, Hd(this.a, a + 1, d))) : (new Jd(null, 1 << (this.Ba >>> a & 31), [null, this])).fa(a, b, c, d, e);
};
function Pd() {
  switch(arguments.length) {
    case 6:
      return Qd(arguments[0], arguments[1], arguments[2], arguments[3], arguments[4], arguments[5]);
    case 7:
      return Od(arguments[0], arguments[1], arguments[2], arguments[3], arguments[4], arguments[5], arguments[6]);
    default:
      throw Error([C("Invalid arity: "), C(arguments.length)].join(""));;
  }
}
function Qd(a, b, c, d, e, g) {
  var h = Db(b);
  if (h === d) {
    return new Ud(null, h, 2, [b, c, e, g]);
  }
  var k = new Fd;
  return Md.fa(a, h, b, c, k).fa(a, d, e, g, k);
}
function Od(a, b, c, d, e, g, h) {
  var k = Db(c);
  if (k === e) {
    return new Ud(null, k, 2, [c, d, g, h]);
  }
  var l = new Fd;
  return Md.ga(a, b, k, c, d, l).ga(a, b, e, g, h, l);
}
function Vd(a, b, c, d, e) {
  this.m = a;
  this.Da = b;
  this.i = c;
  this.s = d;
  this.l = e;
  this.h = 32374860;
  this.v = 0;
}
f = Vd.prototype;
f.toString = function() {
  return ub(this);
};
f.equiv = function(a) {
  return this.o(null, a);
};
f.L = function() {
  return this.m;
};
f.F = function() {
  var a = this.l;
  return null != a ? a : this.l = a = Kb(this);
};
f.o = function(a, b) {
  return Wb(this, b);
};
f.N = function(a, b) {
  return sc(b, this);
};
f.O = function(a, b, c) {
  return vc(b, c, this);
};
f.U = function() {
  return null == this.s ? new W(null, 2, 5, gd, [this.Da[this.i], this.Da[this.i + 1]], null) : L(this.s);
};
f.$ = function() {
  if (null == this.s) {
    var a = this.Da, b = this.i + 2;
    return Wd ? Wd(a, b, null) : Ld.call(null, a, b, null);
  }
  var a = this.Da, b = this.i, c = M(this.s);
  return Wd ? Wd(a, b, c) : Ld.call(null, a, b, c);
};
f.J = function() {
  return this;
};
f.P = function(a, b) {
  return new Vd(b, this.Da, this.i, this.s, this.l);
};
f.K = function(a, b) {
  return P(b, this);
};
Vd.prototype[Aa] = function() {
  return O(this);
};
function Ld() {
  switch(arguments.length) {
    case 1:
      return Kd(arguments[0]);
    case 3:
      return Wd(arguments[0], arguments[1], arguments[2]);
    default:
      throw Error([C("Invalid arity: "), C(arguments.length)].join(""));;
  }
}
function Kd(a) {
  return Wd(a, 0, null);
}
function Wd(a, b, c) {
  if (null == c) {
    for (c = a.length;;) {
      if (b < c) {
        if (null != a[b]) {
          return new Vd(null, a, b, null, null);
        }
        var d = a[b + 1];
        if (x(d) && (d = d.Ma(), x(d))) {
          return new Vd(null, a, b + 2, d, null);
        }
        b += 2;
      } else {
        return null;
      }
    }
  } else {
    return new Vd(null, a, b, c, null);
  }
}
function Xd(a, b, c, d, e) {
  this.m = a;
  this.Da = b;
  this.i = c;
  this.s = d;
  this.l = e;
  this.h = 32374860;
  this.v = 0;
}
f = Xd.prototype;
f.toString = function() {
  return ub(this);
};
f.equiv = function(a) {
  return this.o(null, a);
};
f.L = function() {
  return this.m;
};
f.F = function() {
  var a = this.l;
  return null != a ? a : this.l = a = Kb(this);
};
f.o = function(a, b) {
  return Wb(this, b);
};
f.N = function(a, b) {
  return sc(b, this);
};
f.O = function(a, b, c) {
  return vc(b, c, this);
};
f.U = function() {
  return L(this.s);
};
f.$ = function() {
  var a = this.Da, b = this.i, c = M(this.s);
  return Yd ? Yd(null, a, b, c) : Sd.call(null, null, a, b, c);
};
f.J = function() {
  return this;
};
f.P = function(a, b) {
  return new Xd(b, this.Da, this.i, this.s, this.l);
};
f.K = function(a, b) {
  return P(b, this);
};
Xd.prototype[Aa] = function() {
  return O(this);
};
function Sd() {
  switch(arguments.length) {
    case 1:
      return Rd(arguments[0]);
    case 4:
      return Yd(arguments[0], arguments[1], arguments[2], arguments[3]);
    default:
      throw Error([C("Invalid arity: "), C(arguments.length)].join(""));;
  }
}
function Rd(a) {
  return Yd(null, a, 0, null);
}
function Yd(a, b, c, d) {
  if (null == d) {
    for (d = b.length;;) {
      if (c < d) {
        var e = b[c];
        if (x(e) && (e = e.Ma(), x(e))) {
          return new Xd(a, b, c + 1, e, null);
        }
        c += 1;
      } else {
        return null;
      }
    }
  } else {
    return new Xd(a, b, c, d, null);
  }
}
function Zd(a, b, c, d, e, g) {
  this.m = a;
  this.f = b;
  this.root = c;
  this.ba = d;
  this.da = e;
  this.l = g;
  this.h = 16123663;
  this.v = 8196;
}
f = Zd.prototype;
f.toString = function() {
  return ub(this);
};
f.equiv = function(a) {
  return this.o(null, a);
};
f.keys = function() {
  return O(xd.g ? xd.g(this) : xd.call(null, this));
};
f.entries = function() {
  return td(J(this));
};
f.values = function() {
  return O(zd.g ? zd.g(this) : zd.call(null, this));
};
f.has = function(a) {
  return dc(this, a, qc) === qc ? !1 : !0;
};
f.get = function(a, b) {
  return this.A(null, a, b);
};
f.forEach = function(a) {
  for (var b = J(this), c = null, d = 0, e = 0;;) {
    if (e < d) {
      var g = c.H(null, e), h = bc(g, 0), g = bc(g, 1);
      a.c ? a.c(g, h) : a.call(null, g, h);
      e += 1;
    } else {
      if (b = J(b)) {
        nc(b) ? (c = ob(b), b = pb(b), h = c, d = R(c), c = h) : (c = L(b), h = bc(c, 0), c = g = bc(c, 1), a.c ? a.c(c, h) : a.call(null, c, h), b = M(b), c = null, d = 0), e = 0;
      } else {
        return null;
      }
    }
  }
};
f.I = function(a, b) {
  return H.j(this, b, null);
};
f.A = function(a, b, c) {
  return null == b ? this.ba ? this.da : c : null == this.root ? c : this.root.Ga(0, Db(b), b, c);
};
f.L = function() {
  return this.m;
};
f.T = function() {
  return this.f;
};
f.F = function() {
  var a = this.l;
  return null != a ? a : this.l = a = Mb(this);
};
f.o = function(a, b) {
  return rd(this, b);
};
f.Na = function() {
  return new $d({}, this.root, this.f, this.ba, this.da);
};
f.Ka = function(a, b, c) {
  if (null == b) {
    return this.ba && c === this.da ? this : new Zd(this.m, this.ba ? this.f : this.f + 1, this.root, !0, c, null);
  }
  a = new Fd;
  b = (null == this.root ? Md : this.root).fa(0, Db(b), b, c, a);
  return b === this.root ? this : new Zd(this.m, a.ia ? this.f + 1 : this.f, b, this.ba, this.da, null);
};
f.J = function() {
  if (0 < this.f) {
    var a = null != this.root ? this.root.Ma() : null;
    return this.ba ? P(new W(null, 2, 5, gd, [null, this.da], null), a) : a;
  }
  return null;
};
f.P = function(a, b) {
  return new Zd(b, this.f, this.root, this.ba, this.da, this.l);
};
f.K = function(a, b) {
  if (lc(b)) {
    return Na(this, D.c(b, 0), D.c(b, 1));
  }
  for (var c = this, d = J(b);;) {
    if (null == d) {
      return c;
    }
    var e = L(d);
    if (lc(e)) {
      c = Na(c, D.c(e, 0), D.c(e, 1)), d = M(d);
    } else {
      throw Error("conj on a map takes map entries or seqables of map entries");
    }
  }
};
f.call = function() {
  var a = null, a = function(a, c, d) {
    switch(arguments.length) {
      case 2:
        return this.I(null, c);
      case 3:
        return this.A(null, c, d);
    }
    throw Error("Invalid arity: " + arguments.length);
  };
  a.c = function(a, c) {
    return this.I(null, c);
  };
  a.j = function(a, c, d) {
    return this.A(null, c, d);
  };
  return a;
}();
f.apply = function(a, b) {
  return this.call.apply(this, [this].concat(Ba(b)));
};
f.g = function(a) {
  return this.I(null, a);
};
f.c = function(a, b) {
  return this.A(null, a, b);
};
var fc = new Zd(null, 0, null, !1, null, Nb);
Zd.prototype[Aa] = function() {
  return O(this);
};
function $d(a, b, c, d, e) {
  this.u = a;
  this.root = b;
  this.count = c;
  this.ba = d;
  this.da = e;
  this.h = 258;
  this.v = 56;
}
function ae(a, b) {
  if (a.u) {
    if (b ? b.h & 2048 || b.sb || (b.h ? 0 : z(Pa, b)) : z(Pa, b)) {
      return be(a, Cd.g ? Cd.g(b) : Cd.call(null, b), Dd.g ? Dd.g(b) : Dd.call(null, b));
    }
    for (var c = J(b), d = a;;) {
      var e = L(c);
      if (x(e)) {
        var g = e, c = M(c), d = be(d, function() {
          var a = g;
          return Cd.g ? Cd.g(a) : Cd.call(null, a);
        }(), function() {
          var a = g;
          return Dd.g ? Dd.g(a) : Dd.call(null, a);
        }())
      } else {
        return d;
      }
    }
  } else {
    throw Error("conj! after persistent");
  }
}
function be(a, b, c) {
  if (a.u) {
    if (null == b) {
      a.da !== c && (a.da = c), a.ba || (a.count += 1, a.ba = !0);
    } else {
      var d = new Fd;
      b = (null == a.root ? Md : a.root).ga(a.u, 0, Db(b), b, c, d);
      b !== a.root && (a.root = b);
      d.ia && (a.count += 1);
    }
    return a;
  }
  throw Error("assoc! after persistent!");
}
f = $d.prototype;
f.T = function() {
  if (this.u) {
    return this.count;
  }
  throw Error("count after persistent!");
};
f.I = function(a, b) {
  return null == b ? this.ba ? this.da : null : null == this.root ? null : this.root.Ga(0, Db(b), b);
};
f.A = function(a, b, c) {
  return null == b ? this.ba ? this.da : c : null == this.root ? c : this.root.Ga(0, Db(b), b, c);
};
f.Ra = function(a, b) {
  return ae(this, b);
};
f.Sa = function() {
  var a;
  if (this.u) {
    this.u = null, a = new Zd(null, this.count, this.root, this.ba, this.da, null);
  } else {
    throw Error("persistent! called twice");
  }
  return a;
};
f.La = function(a, b, c) {
  return be(this, b, c);
};
function ce(a, b) {
  this.S = a;
  this.ea = b;
  this.h = 32374988;
  this.v = 0;
}
f = ce.prototype;
f.toString = function() {
  return ub(this);
};
f.equiv = function(a) {
  return this.o(null, a);
};
f.L = function() {
  return this.ea;
};
f.Z = function() {
  var a = this.S, a = (a ? a.h & 128 || a.Qa || (a.h ? 0 : z(Ka, a)) : z(Ka, a)) ? this.S.Z(null) : M(this.S);
  return null == a ? null : new ce(a, this.ea);
};
f.F = function() {
  return Kb(this);
};
f.o = function(a, b) {
  return Wb(this, b);
};
f.N = function(a, b) {
  return sc(b, this);
};
f.O = function(a, b, c) {
  return vc(b, c, this);
};
f.U = function() {
  return this.S.U(null).Ya();
};
f.$ = function() {
  var a = this.S, a = (a ? a.h & 128 || a.Qa || (a.h ? 0 : z(Ka, a)) : z(Ka, a)) ? this.S.Z(null) : M(this.S);
  return null != a ? new ce(a, this.ea) : Hb;
};
f.J = function() {
  return this;
};
f.P = function(a, b) {
  return new ce(this.S, b);
};
f.K = function(a, b) {
  return P(b, this);
};
ce.prototype[Aa] = function() {
  return O(this);
};
function xd(a) {
  return (a = J(a)) ? new ce(a, null) : null;
}
function Cd(a) {
  return Qa(a);
}
function de(a, b) {
  this.S = a;
  this.ea = b;
  this.h = 32374988;
  this.v = 0;
}
f = de.prototype;
f.toString = function() {
  return ub(this);
};
f.equiv = function(a) {
  return this.o(null, a);
};
f.L = function() {
  return this.ea;
};
f.Z = function() {
  var a = this.S, a = (a ? a.h & 128 || a.Qa || (a.h ? 0 : z(Ka, a)) : z(Ka, a)) ? this.S.Z(null) : M(this.S);
  return null == a ? null : new de(a, this.ea);
};
f.F = function() {
  return Kb(this);
};
f.o = function(a, b) {
  return Wb(this, b);
};
f.N = function(a, b) {
  return sc(b, this);
};
f.O = function(a, b, c) {
  return vc(b, c, this);
};
f.U = function() {
  return this.S.U(null).Za();
};
f.$ = function() {
  var a = this.S, a = (a ? a.h & 128 || a.Qa || (a.h ? 0 : z(Ka, a)) : z(Ka, a)) ? this.S.Z(null) : M(this.S);
  return null != a ? new de(a, this.ea) : Hb;
};
f.J = function() {
  return this;
};
f.P = function(a, b) {
  return new de(this.S, b);
};
f.K = function(a, b) {
  return P(b, this);
};
de.prototype[Aa] = function() {
  return O(this);
};
function zd(a) {
  return (a = J(a)) ? new de(a, null) : null;
}
function Dd(a) {
  return Ra(a);
}
function ee(a) {
  if (a && (a.v & 4096 || a.ub)) {
    return a.name;
  }
  if ("string" === typeof a) {
    return a;
  }
  throw Error([C("Doesn't support name: "), C(a)].join(""));
}
function fe(a, b, c, d, e, g, h) {
  var k = ha;
  ha = null == ha ? null : ha - 1;
  try {
    if (null != ha && 0 > ha) {
      return I(a, "#");
    }
    I(a, c);
    if (0 === ua.g(g)) {
      J(h) && I(a, function() {
        var a = ge.g(g);
        return x(a) ? a : "...";
      }());
    } else {
      if (J(h)) {
        var l = L(h);
        b.j ? b.j(l, a, g) : b.call(null, l, a, g);
      }
      for (var m = M(h), n = ua.g(g) - 1;;) {
        if (!m || null != n && 0 === n) {
          J(m) && 0 === n && (I(a, d), I(a, function() {
            var a = ge.g(g);
            return x(a) ? a : "...";
          }()));
          break;
        } else {
          I(a, d);
          var p = L(m);
          c = a;
          h = g;
          b.j ? b.j(p, c, h) : b.call(null, p, c, h);
          var q = M(m);
          c = n - 1;
          m = q;
          n = c;
        }
      }
    }
    return I(a, e);
  } finally {
    ha = k;
  }
}
function he(a, b) {
  for (var c = J(b), d = null, e = 0, g = 0;;) {
    if (g < e) {
      var h = d.H(null, g);
      I(a, h);
      g += 1;
    } else {
      if (c = J(c)) {
        d = c, nc(d) ? (c = ob(d), e = pb(d), d = c, h = R(c), c = e, e = h) : (h = L(d), I(a, h), c = M(d), d = null, e = 0), g = 0;
      } else {
        return null;
      }
    }
  }
}
var ie = {'"':'\\"', "\\":"\\\\", "\b":"\\b", "\f":"\\f", "\n":"\\n", "\r":"\\r", "\t":"\\t"};
function je(a) {
  return [C('"'), C(a.replace(RegExp('[\\\\"\b\f\n\r\t]', "g"), function(a) {
    return ie[a];
  })), C('"')].join("");
}
function le(a, b, c) {
  if (null == a) {
    return I(b, "nil");
  }
  if (void 0 === a) {
    return I(b, "#\x3cundefined\x3e");
  }
  if (x(function() {
    var b = cc(c, ra);
    return x(b) ? (b = a ? a.h & 131072 || a.tb ? !0 : a.h ? !1 : z(Va, a) : z(Va, a)) ? jc(a) : b : b;
  }())) {
    I(b, "^");
    var d = jc(a);
    Z.j ? Z.j(d, b, c) : Z.call(null, d, b, c);
    I(b, " ");
  }
  return null == a ? I(b, "nil") : a.xb ? a.Hb(a, b, c) : a && (a.h & 2147483648 || a.M) ? a.C(null, b, c) : (null == a ? null : a.constructor) === Boolean || "number" === typeof a ? I(b, "" + C(a)) : null != a && a.constructor === Object ? (I(b, "#js "), d = U.c(function(b) {
    return new W(null, 2, 5, gd, [Cc.g(b), a[b]], null);
  }, oc(a)), me.Y ? me.Y(d, Z, b, c) : me.call(null, d, Z, b, c)) : va(a) ? fe(b, Z, "#js [", " ", "]", c, a) : x("string" == typeof a) ? x(pa.g(c)) ? I(b, je(a)) : I(b, a) : gc(a) ? he(b, Yb(["#\x3c", "" + C(a), "\x3e"], 0)) : a instanceof Date ? (d = function(a, b) {
    for (var c = "" + C(a);;) {
      if (R(c) < b) {
        c = [C("0"), C(c)].join("");
      } else {
        return c;
      }
    }
  }, he(b, Yb(['#inst "', "" + C(a.getUTCFullYear()), "-", d(a.getUTCMonth() + 1, 2), "-", d(a.getUTCDate(), 2), "T", d(a.getUTCHours(), 2), ":", d(a.getUTCMinutes(), 2), ":", d(a.getUTCSeconds(), 2), ".", d(a.getUTCMilliseconds(), 3), "-", '00:00"'], 0))) : x(a instanceof RegExp) ? he(b, Yb(['#"', a.source, '"'], 0)) : (a ? a.h & 2147483648 || a.M || (a.h ? 0 : z(gb, a)) : z(gb, a)) ? hb(a, b, c) : he(b, Yb(["#\x3c", "" + C(a), "\x3e"], 0));
}
function Z(a, b, c) {
  var d = ne.g(c);
  return x(d) ? (c = ec.j(c, oe, le), d.j ? d.j(a, b, c) : d.call(null, a, b, c)) : le(a, b, c);
}
function me(a, b, c, d) {
  return fe(c, function(a, c, d) {
    var k = Qa(a);
    b.j ? b.j(k, c, d) : b.call(null, k, c, d);
    I(c, " ");
    a = Ra(a);
    return b.j ? b.j(a, c, d) : b.call(null, a, c, d);
  }, "{", ", ", "}", d, J(a));
}
Fb.prototype.M = !0;
Fb.prototype.C = function(a, b, c) {
  return fe(b, Z, "(", " ", ")", c, this);
};
Dc.prototype.M = !0;
Dc.prototype.C = function(a, b, c) {
  return fe(b, Z, "(", " ", ")", c, this);
};
Vd.prototype.M = !0;
Vd.prototype.C = function(a, b, c) {
  return fe(b, Z, "(", " ", ")", c, this);
};
vd.prototype.M = !0;
vd.prototype.C = function(a, b, c) {
  return fe(b, Z, "(", " ", ")", c, this);
};
hd.prototype.M = !0;
hd.prototype.C = function(a, b, c) {
  return fe(b, Z, "(", " ", ")", c, this);
};
Bc.prototype.M = !0;
Bc.prototype.C = function(a, b, c) {
  return fe(b, Z, "(", " ", ")", c, this);
};
Zd.prototype.M = !0;
Zd.prototype.C = function(a, b, c) {
  return me(this, Z, b, c);
};
Xd.prototype.M = !0;
Xd.prototype.C = function(a, b, c) {
  return fe(b, Z, "(", " ", ")", c, this);
};
ld.prototype.M = !0;
ld.prototype.C = function(a, b, c) {
  return fe(b, Z, "[", " ", "]", c, this);
};
Hc.prototype.M = !0;
Hc.prototype.C = function(a, b, c) {
  return fe(b, Z, "(", " ", ")", c, this);
};
de.prototype.M = !0;
de.prototype.C = function(a, b, c) {
  return fe(b, Z, "(", " ", ")", c, this);
};
W.prototype.M = !0;
W.prototype.C = function(a, b, c) {
  return fe(b, Z, "[", " ", "]", c, this);
};
Ac.prototype.M = !0;
Ac.prototype.C = function(a, b) {
  return I(b, "()");
};
ma.prototype.M = !0;
ma.prototype.C = function(a, b, c) {
  return me(this, Z, b, c);
};
ce.prototype.M = !0;
ce.prototype.C = function(a, b, c) {
  return fe(b, Z, "(", " ", ")", c, this);
};
zc.prototype.M = !0;
zc.prototype.C = function(a, b, c) {
  return fe(b, Z, "(", " ", ")", c, this);
};
var pe = {}, qe = function qe(b) {
  if (b ? b.nb : b) {
    return b.nb(b);
  }
  var c;
  c = qe[u(null == b ? null : b)];
  if (!c && (c = qe._, !c)) {
    throw A("IEncodeJS.-clj-\x3ejs", b);
  }
  return c.call(null, b);
};
function re(a) {
  if (a ? x(x(null) ? null : a.mb) || (a.hb ? 0 : z(pe, a)) : z(pe, a)) {
    a = qe(a);
  } else {
    if ("string" === typeof a || "number" === typeof a || a instanceof T) {
      a = se.g ? se.g(a) : se.call(null, a);
    } else {
      var b = Yb([a], 0);
      a = la();
      if (null == b || wa(J(b))) {
        a = "";
      } else {
        var c = C, d = new fa;
        a: {
          var e = new tb(d);
          Z(L(b), e, a);
          for (var b = J(M(b)), g = null, h = 0, k = 0;;) {
            if (k < h) {
              var l = g.H(null, k);
              I(e, " ");
              Z(l, e, a);
              k += 1;
            } else {
              if (b = J(b)) {
                g = b, nc(g) ? (b = ob(g), h = pb(g), g = b, l = R(b), b = h, h = l) : (l = L(g), I(e, " "), Z(l, e, a), b = M(g), g = null, h = 0), k = 0;
              } else {
                break a;
              }
            }
          }
        }
        a = "" + c(d);
      }
    }
  }
  return a;
}
var se = function se(b) {
  if (null == b) {
    return null;
  }
  if (b ? x(x(null) ? null : b.mb) || (b.hb ? 0 : z(pe, b)) : z(pe, b)) {
    return qe(b);
  }
  if (b instanceof T) {
    return ee(b);
  }
  if (kc(b)) {
    var c = {};
    b = J(b);
    for (var d = null, e = 0, g = 0;;) {
      if (g < e) {
        var h = d.H(null, g), k = bc(h, 0), h = bc(h, 1);
        c[re(k)] = se(h);
        g += 1;
      } else {
        if (b = J(b)) {
          nc(b) ? (e = ob(b), b = pb(b), d = e, e = R(e)) : (e = L(b), d = bc(e, 0), e = bc(e, 1), c[re(d)] = se(e), b = M(b), d = null, e = 0), g = 0;
        } else {
          break;
        }
      }
    }
    return c;
  }
  if (null == b ? 0 : b ? b.h & 8 || b.Ab || (b.h ? 0 : z(Fa, b)) : z(Fa, b)) {
    c = [];
    b = J(U.c(se, b));
    d = null;
    for (g = e = 0;;) {
      if (g < e) {
        k = d.H(null, g), c.push(k), g += 1;
      } else {
        if (b = J(b)) {
          d = b, nc(d) ? (b = ob(d), g = pb(d), d = b, e = R(b), b = g) : (b = L(d), c.push(b), b = M(d), d = null, e = 0), g = 0;
        } else {
          break;
        }
      }
    }
    return c;
  }
  return b;
};
var te = new T(null, "async", "async", 1050769601), ra = new T(null, "meta", "meta", 1499536964), ta = new T(null, "dup", "dup", 556298533), ue = new T(null, "src", "src", -1651076051), oe = new T(null, "fallback-impl", "fallback-impl", -1501286995), oa = new T(null, "flush-on-newline", "flush-on-newline", -151457939), pa = new T(null, "readably", "readably", 1129599760), ge = new T(null, "more-marker", "more-marker", -14717935), ua = new T(null, "print-length", "print-length", 1931866356), ve = 
new T(null, "condition", "condition", 1668437652), ne = new T(null, "alt-impl", "alt-impl", 670969595);
Reveal.Jb(se(new ma(null, 6, [new T(null, "controls", "controls", 1340701452), !0, new T(null, "progress", "progress", 244323547), !0, new T(null, "history", "history", -247395220), !0, new T(null, "center", "center", -748944368), !0, new T(null, "transition", "transition", 765692007), "slide", new T(null, "dependencies", "dependencies", 1108064605), new W(null, 6, 5, gd, [new ma(null, 2, [ue, "bower_components/reveal.js/lib/js/classList.js", ve, function() {
  return wa(document.body.classList);
}], null), new ma(null, 2, [ue, "bower_components/reveal.js/plugin/markdown/marked.js", ve, function() {
  return !wa(document.querySelector("[data-markdown]"));
}], null), new ma(null, 2, [ue, "bower_components/reveal.js/plugin/markdown/markdown.js", ve, function() {
  return !wa(document.querySelector("[data-markdown]"));
}], null), new ma(null, 4, [ue, "bower_components/reveal.js/plugin/highlight/highlight.js", te, !0, ve, function() {
  return document.querySelector("pre code");
}, new T(null, "callback", "callback", -705136228), function() {
  return hljs.Ib();
}], null), new ma(null, 2, [ue, "bower_components/reveal.js/plugin/zoom-js/zoom.js", te, !0], null), new ma(null, 2, [ue, "bower_components/reveal.js/plugin/notes/notes.js", te, !0], null)], null)], null)));

})();
