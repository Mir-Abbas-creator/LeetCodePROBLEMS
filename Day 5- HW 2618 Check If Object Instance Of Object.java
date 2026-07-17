function checkIfInstanceOf(obj, classFunction) {
    if (obj === null || obj === undefined || typeof classFunction !== 'function') {
        return false;
    }
    // Traverse the prototype chain
    let proto = Object.getPrototypeOf(obj);
    while (proto !== null) {
        if (proto === classFunction.prototype) return true;
        proto = Object.getPrototypeOf(proto);
    }
    return false;
}
