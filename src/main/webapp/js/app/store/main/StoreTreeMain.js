Ext.define('eCredit.store.main.StoreTreeMain',{
    extend:'Ext.data.TreeStore',
    model:'eCredit.model.main.ModelTreeMain',
    proxy : {
        type : 'ajax',
        //url : 'showListTreePanel.htm',//getListPersons
        url : 'getListPersons.htm',
        reader : {
            type:'json',
            root : 'data',
            successProperty: 'success'
        }
    },
    root:{
        expanded: true
    }

});