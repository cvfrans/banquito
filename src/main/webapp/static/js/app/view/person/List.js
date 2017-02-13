
Ext.define('eCredit.view.person.List' ,{
    extend: 'Ext.grid.Panel',
    alias : 'widget.PersonList',
    title : 'All Persons',
    store: 'Persons',
    loadMask: true,
    columnLines: true,

/*
    tbar: [
        {
            xtype: 'UpperCaseTextField',
            fieldLabel:'BUSCAR',
            action:'searchRoleGeneral',
            labelWidth:60,
            width:300
        },'-'

    ],
    bbar:{
        xtype: 'pagingtoolbar',
        pageSize: 10,
        store: 'store.Persons',
        displayInfo: true,
        displayMsg: 'Mostrando {0} - {1} de {2}',
        items:['-',{text:'EXPORTAR A PDF',action:'exportUserPdf',iconCls:'pdf'},'-',{text:'EXPORTAR A EXCEL',action:'exportUserXls',iconCls:'excel'},'-',{ xtype: 'UpperCaseTrigger',action:'searchGridRoleGeneral',fieldLabel:'FILTRO',labelWidth:60,width:300}],
        emptyMsg: 'No existe informaci&oacute;n a mostrar'

    },
*/
    listeners:{
        render:function(){
            var me = this;
            me.store.getProxy().extraParams = {propertyOrder: 'fullName'};
            me.store.getProxy().url = 'getListPersons.htm';
            //me.down('pagingtoolbar').moveFirst();
        }
    },

    initComponent: function() {
        this.columns = [

            {xtype: 'rownumberer', width:25, sortable: false},
            {header: 'Nombre',              dataIndex: 'name',  flex:1},
            {header: 'Correo Electronico',  dataIndex: 'email', flex:1, sortable: false,
                renderer: function(value) {
                    return Ext.String.format('<a href="mailto:{0}">{1}</a>', value, value);
                }
            },
            {header: 'Telefono',            dataIndex: 'phone',         sortable: false }

        ];
        this.callParent(arguments);
    }


});