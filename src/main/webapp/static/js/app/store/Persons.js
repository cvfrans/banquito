
Ext.define('eCredit.store.Persons', {
    extend: 'Ext.data.Store',
    model: 'eCredit.model.Person',
    autoLoad: true,
    start: 0,
    limit: 10,
    pageSize: 5,
    proxy : {
        type: 'ajax',
        api: {
            read: 'getListPersons.htm',
            update: 'updatePersons.htm'
        },
        reader: {
            type: 'json',
            root: 'data',
            totalProperty: 'totalCount',
            successProperty: 'success'
        }
    }

});