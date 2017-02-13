Ext.define('eCredit.store.persona.PersonaStore',{
    extend: 'Ext.data.Store',
    model: 'eCredit.model.persona.PersonaModel',
    pageSize: 4,
    proxy: {
        type: 'ajax',
        //url: 'getListPersons.htm',
        actionMethods: {
            create: 'POST',
            read: 'GET',
            update: 'POST',
            destroy:'POST'
        },
        api: {
            create: 'createPersona.htm',
            read: 'listPersonActive.htm',
            update: 'updatePersona.htm',
            destroy: 'deletePersona.htm'
        },

        /*
        extraParams:{
            numeroDni: Ext.ComponentQuery.query('ViewPanelGridPersona grid')[0].getSelectionModel().getSelection()[0].get('numeroDni')
        },
        */

        reader: {
            type: 'json'
            ,root: 'data'
            //,totalProperty: 'totalCount'
            //,successProperty: 'success'
        },

        writer: {
            type: 'json',
            root: 'data',
            encode: true
        }
    },
    autoLoad: true
});

