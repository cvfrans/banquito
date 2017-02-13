
Ext.define("eCredit.view.main.ViewTreeMain",{
	extend:"Ext.tree.Panel",
    cls: 'custom-grid',
	id:'idViewTreeMain',
//    cls:'my-header',
	alias:'widget.ViewTreeMain',
	//store:'eCredit.store.main.StoreTreeMain',
	rootVisible: false,

	/*
	mixins: {
		treeFilter: 'eCredit.core.lib.extjs4-treefilter'
	 },
	   dockedItems:[{
		   xtype:'toolbar',
		   items:[
			   {tooltip: "Expandir",icon: 'static/core/images/expand-all.gif',action:'expand'},
			   {tooltip: "Colapsar",icon: 'static/core/images/expand-all.gif',action:'colapse'}
		   ]
	   }],
	*/

	root: {
		text: 'Root',
		expanded: true,
		children: [
			{
				text: 'Creditos',
				expanded: true,
				children: [
					{
						text: 'Solicitar de Credito',
						leaf: true,
						useArrows: true
						,handler: function () {
							alert("1");
						}
					},
					{
						text: 'Aprobar Solicitud',
						leaf: true,
						useArrows: true
						,handler: function () {
							alert("2");
						}
					},
					{
						text: 'Emitir Credito',
						leaf: true,
						useArrows: true
						,handler: function () {
							alert("3");
						}
					}
				]
			},
			{
				text: 'Pagos',
				expanded: true,
				children: [
					{
						text: 'Pagar Letra de Credito',
						leaf: true,
						useArrows: true
					},
					{
						text: 'Pagar Mora de Credito',
						leaf: true,
						useArrows: true
					},
					{
						text: 'Pagar Aporte',
						leaf: true,
						useArrows: true
					},
					{
						text: 'Pagar Mora de Aporte',
						leaf: true,
						useArrows: true
					}
				]
			},
			{
				text: 'Depositos',
				expanded: false,
				children:[
					{
						text: 'Deposito a Cuenta de Ahorro',
						leaf: true
					}
				]
			},
			{
				text: 'Retiros',
				expanded: false,
				children:[
					{
						text: 'Retiro Cuenta de Ahorro',
						leaf: true
					}
				]
			},
			{
				text: 'Caja / Boveda',
				expanded: false,
				children:[
					{
						text: 'Abrir Boveda',
						leaf: true
					},
					{
						text: 'Cerrar Boveda',
						leaf: true
					},
					{
						text: 'Abrir Caja',
						leaf: true
					},
					{
						text: 'Cerrar Caja',
						leaf: true
					},
					{
						text: 'Transferencia de Boveda a Caja',
						leaf: true
					},
					{
						text: 'Transferencia de Caja a Boveda',
						leaf: true
					}
				]
			},
			{
				text: 'Registro',
				expanded: true,
				children:[
					{
						text: 'Registrar Persona',
						leaf: true
					},
					{
						text: 'Registrar Socio',
						leaf: true
					}
				]
			},
			{
				text: 'Help me',
				leaf: true
			}

		]
	}
	/*
	,listeners:{
		itemclick:function(){

			var panelForm = Ext.create('Ext.panel.Panel',{
				title:'Registrar Persona',
				closable:true,
				bodyPadding: 5,
				//model: 'eCredit.model.register.ModelGridPanelRegisterPersona',
				width: 400,
				height: 200,
				activeTab: 0,
				//plain: true,

				html: '<p>World!</p>',
				renderTo: Ext.getBody()
			});


			var panel = Ext.ComponentQuery.query('ViewPanelMain')[0];
			var tabPanel= panel.down('tabpanel');
			//var tabPanel= panel.down('#editorTabPanelMain');
			//console.log(panel.down('#editorTabPanelMain'));
			//console.log(panel.down('tabpanel'));
			tabPanel.add(panelForm);
			//tabPanel.addPanel(panelForm);
		},

		itemdblclick:function(){
			console.log("doble click");
		}
	}
	*/

});

