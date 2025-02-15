// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package xlsreport.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the XLSReport module
	public static void aCr_Constraint(IContext context, xlsreport.proxies.MxConstraint _mxConstraint)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxConstraint", _mxConstraint == null ? null : _mxConstraint.getMendixObject());
		Core.microflowCall("XLSReport.ACr_Constraint").withParams(params).execute(context);
	}
	public static void aCr_Sorting(IContext context, xlsreport.proxies.MxSorting _mxSorting)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxSorting", _mxSorting == null ? null : _mxSorting.getMendixObject());
		Core.microflowCall("XLSReport.ACr_Sorting").withParams(params).execute(context);
	}
	public static boolean bCo_MxData(IContext context, xlsreport.proxies.MxData _mxData)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxData", _mxData == null ? null : _mxData.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("XLSReport.BCo_MxData").withParams(params).execute(context);
	}
	public static boolean bCo_Sheet(IContext context, xlsreport.proxies.MxSheet _mxSheet)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxSheet", _mxSheet == null ? null : _mxSheet.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("XLSReport.BCo_Sheet").withParams(params).execute(context);
	}
	public static boolean bDe_MxXpath(IContext context, xlsreport.proxies.MxXPath _mxXPath)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxXPath", _mxXPath == null ? null : _mxXPath.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("XLSReport.BDe_MxXpath").withParams(params).execute(context);
	}
	public static void column_CSV_New(IContext context, xlsreport.proxies.MxSheet _mxSheet)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxSheet", _mxSheet == null ? null : _mxSheet.getMendixObject());
		Core.microflowCall("XLSReport.Column_CSV_New").withParams(params).execute(context);
	}
	public static java.lang.String dataFormatString(IContext context, xlsreport.proxies.MxCellStyle _mxCellStyle)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxCellStyle", _mxCellStyle == null ? null : _mxCellStyle.getMendixObject());
		return (java.lang.String) Core.microflowCall("XLSReport.DataFormatString").withParams(params).execute(context);
	}
	public static java.util.List<mxmodelreflection.proxies.MxObjectMember> dS_Attribute(IContext context, xlsreport.proxies.MxXPath _mxXPath)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxXPath", _mxXPath == null ? null : _mxXPath.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("XLSReport.DS_Attribute").withParams(params).execute(context);
		java.util.List<mxmodelreflection.proxies.MxObjectMember> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(mxmodelreflection.proxies.MxObjectMember.initialize(context, obj));
		}
		return result;
	}
	public static java.util.List<mxmodelreflection.proxies.MxObjectMember> dS_Constraint_attribute(IContext context, xlsreport.proxies.MxXPath _mxXpath)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxXpath", _mxXpath == null ? null : _mxXpath.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("XLSReport.DS_Constraint_attribute").withParams(params).execute(context);
		java.util.List<mxmodelreflection.proxies.MxObjectMember> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(mxmodelreflection.proxies.MxObjectMember.initialize(context, obj));
		}
		return result;
	}
	public static java.util.List<mxmodelreflection.proxies.MxObjectReference> dS_Constraint_reference(IContext context, xlsreport.proxies.MxXPath _mxXpath)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxXpath", _mxXpath == null ? null : _mxXpath.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("XLSReport.DS_Constraint_reference").withParams(params).execute(context);
		java.util.List<mxmodelreflection.proxies.MxObjectReference> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(mxmodelreflection.proxies.MxObjectReference.initialize(context, obj));
		}
		return result;
	}
	public static java.util.List<mxmodelreflection.proxies.MxObjectMember> dS_First_Attribute(IContext context, xlsreport.proxies.MxXPath _mxXpath)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxXpath", _mxXpath == null ? null : _mxXpath.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("XLSReport.DS_First_Attribute").withParams(params).execute(context);
		java.util.List<mxmodelreflection.proxies.MxObjectMember> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(mxmodelreflection.proxies.MxObjectMember.initialize(context, obj));
		}
		return result;
	}
	public static java.util.List<mxmodelreflection.proxies.MxObjectReference> dS_First_Reference(IContext context, xlsreport.proxies.MxXPath _mxXpath)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxXpath", _mxXpath == null ? null : _mxXpath.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("XLSReport.DS_First_Reference").withParams(params).execute(context);
		java.util.List<mxmodelreflection.proxies.MxObjectReference> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(mxmodelreflection.proxies.MxObjectReference.initialize(context, obj));
		}
		return result;
	}
	public static java.util.List<mxmodelreflection.proxies.MxObjectReference> dS_Reference(IContext context, xlsreport.proxies.MxXPath _mxXPath)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxXPath", _mxXPath == null ? null : _mxXPath.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("XLSReport.DS_Reference").withParams(params).execute(context);
		java.util.List<mxmodelreflection.proxies.MxObjectReference> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(mxmodelreflection.proxies.MxObjectReference.initialize(context, obj));
		}
		return result;
	}
	public static java.util.List<mxmodelreflection.proxies.MxObjectMember> dS_Sorting_attribute(IContext context, xlsreport.proxies.MxXPath _mxXpath)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxXpath", _mxXpath == null ? null : _mxXpath.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("XLSReport.DS_Sorting_attribute").withParams(params).execute(context);
		java.util.List<mxmodelreflection.proxies.MxObjectMember> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(mxmodelreflection.proxies.MxObjectMember.initialize(context, obj));
		}
		return result;
	}
	public static java.util.List<mxmodelreflection.proxies.MxObjectReference> dS_Sorting_reference(IContext context, xlsreport.proxies.MxXPath _mxXpath)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxXpath", _mxXpath == null ? null : _mxXpath.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("XLSReport.DS_Sorting_reference").withParams(params).execute(context);
		java.util.List<mxmodelreflection.proxies.MxObjectReference> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(mxmodelreflection.proxies.MxObjectReference.initialize(context, obj));
		}
		return result;
	}
	public static java.util.List<mxmodelreflection.proxies.MxObjectMember> dS_StaticInputMember(IContext context, xlsreport.proxies.MxStatic _mxStatic)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxStatic", _mxStatic == null ? null : _mxStatic.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("XLSReport.DS_StaticInputMember").withParams(params).execute(context);
		java.util.List<mxmodelreflection.proxies.MxObjectMember> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(mxmodelreflection.proxies.MxObjectMember.initialize(context, obj));
		}
		return result;
	}
	public static xlsreport.proxies.MxSheet dS_TemplateCSVSheet(IContext context, xlsreport.proxies.MxTemplate _mxTemplate)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxTemplate", _mxTemplate == null ? null : _mxTemplate.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("XLSReport.DS_TemplateCSVSheet").withParams(params).execute(context);
		return result == null ? null : xlsreport.proxies.MxSheet.initialize(context, result);
	}
	public static void generateReport(IContext context, xlsreport.proxies.MxTemplate _template)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Template", _template == null ? null : _template.getMendixObject());
		Core.microflowCall("XLSReport.GenerateReport").withParams(params).execute(context);
	}
	public static java.lang.String integerToNumberFormat(IContext context, java.lang.Long _decimalPlaces)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("DecimalPlaces", _decimalPlaces);
		return (java.lang.String) Core.microflowCall("XLSReport.IntegerToNumberFormat").withParams(params).execute(context);
	}
	public static void iVK_Column_New(IContext context, xlsreport.proxies.MxSheet _mxSheet)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxSheet", _mxSheet == null ? null : _mxSheet.getMendixObject());
		Core.microflowCall("XLSReport.IVK_Column_New").withParams(params).execute(context);
	}
	public static void iVK_Column_Save(IContext context, xlsreport.proxies.MxColumn _mxColumn)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxColumn", _mxColumn == null ? null : _mxColumn.getMendixObject());
		Core.microflowCall("XLSReport.IVK_Column_Save").withParams(params).execute(context);
	}
	public static void iVK_ColumnHigher(IContext context, xlsreport.proxies.MxColumn _mxColumn)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxColumn", _mxColumn == null ? null : _mxColumn.getMendixObject());
		Core.microflowCall("XLSReport.IVK_ColumnHigher").withParams(params).execute(context);
	}
	public static void iVK_ColumnLower(IContext context, xlsreport.proxies.MxColumn _mxColumn)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxColumn", _mxColumn == null ? null : _mxColumn.getMendixObject());
		Core.microflowCall("XLSReport.IVK_ColumnLower").withParams(params).execute(context);
	}
	public static void iVK_Constraint_Higher(IContext context, xlsreport.proxies.MxConstraint _mxConstraint, xlsreport.proxies.MxSheet _mxSheet)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxConstraint", _mxConstraint == null ? null : _mxConstraint.getMendixObject());
		params.put("MxSheet", _mxSheet == null ? null : _mxSheet.getMendixObject());
		Core.microflowCall("XLSReport.IVK_Constraint_Higher").withParams(params).execute(context);
	}
	public static void iVK_Constraint_Lower(IContext context, xlsreport.proxies.MxConstraint _mxConstraint, xlsreport.proxies.MxSheet _mxSheet)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxConstraint", _mxConstraint == null ? null : _mxConstraint.getMendixObject());
		params.put("MxSheet", _mxSheet == null ? null : _mxSheet.getMendixObject());
		Core.microflowCall("XLSReport.IVK_Constraint_Lower").withParams(params).execute(context);
	}
	public static void iVK_ConstraintDelete(IContext context, xlsreport.proxies.MxConstraint _mxConstraint)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxConstraint", _mxConstraint == null ? null : _mxConstraint.getMendixObject());
		Core.microflowCall("XLSReport.IVK_ConstraintDelete").withParams(params).execute(context);
	}
	public static void iVK_ConstraintSave(IContext context, xlsreport.proxies.MxConstraint _mxConstraint)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxConstraint", _mxConstraint == null ? null : _mxConstraint.getMendixObject());
		Core.microflowCall("XLSReport.IVK_ConstraintSave").withParams(params).execute(context);
	}
	public static void iVK_ConstraintSaveAndNext(IContext context, xlsreport.proxies.MxConstraint _mxConstraint)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxConstraint", _mxConstraint == null ? null : _mxConstraint.getMendixObject());
		Core.microflowCall("XLSReport.IVK_ConstraintSaveAndNext").withParams(params).execute(context);
	}
	public static void iVK_CreateNewSheet(IContext context, xlsreport.proxies.MxTemplate _mxTemplate)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxTemplate", _mxTemplate == null ? null : _mxTemplate.getMendixObject());
		Core.microflowCall("XLSReport.IVK_CreateNewSheet").withParams(params).execute(context);
	}
	public static void iVK_DeleteColumn(IContext context, xlsreport.proxies.MxColumn _mxColumn)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxColumn", _mxColumn == null ? null : _mxColumn.getMendixObject());
		Core.microflowCall("XLSReport.IVK_DeleteColumn").withParams(params).execute(context);
	}
	public static void iVK_DeleteExcistFile(IContext context, xlsreport.proxies.MxTemplate _mxTemplate)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxTemplate", _mxTemplate == null ? null : _mxTemplate.getMendixObject());
		Core.microflowCall("XLSReport.IVK_DeleteExcistFile").withParams(params).execute(context);
	}
	public static void iVK_ExcistFile_Save(IContext context, xlsreport.proxies.CustomExcel _excistExcel)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ExcistExcel", _excistExcel == null ? null : _excistExcel.getMendixObject());
		Core.microflowCall("XLSReport.IVK_ExcistFile_Save").withParams(params).execute(context);
	}
	public static void iVK_Sorting_Higher(IContext context, xlsreport.proxies.MxSorting _mxSorting, xlsreport.proxies.MxSheet _mxSheet)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxSorting", _mxSorting == null ? null : _mxSorting.getMendixObject());
		params.put("MxSheet", _mxSheet == null ? null : _mxSheet.getMendixObject());
		Core.microflowCall("XLSReport.IVK_Sorting_Higher").withParams(params).execute(context);
	}
	public static void iVK_Sorting_Lower(IContext context, xlsreport.proxies.MxSorting _mxSorting, xlsreport.proxies.MxSheet _mxSheet)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxSorting", _mxSorting == null ? null : _mxSorting.getMendixObject());
		params.put("MxSheet", _mxSheet == null ? null : _mxSheet.getMendixObject());
		Core.microflowCall("XLSReport.IVK_Sorting_Lower").withParams(params).execute(context);
	}
	public static void iVK_SortingDelete(IContext context, xlsreport.proxies.MxSorting _mxSorting)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxSorting", _mxSorting == null ? null : _mxSorting.getMendixObject());
		Core.microflowCall("XLSReport.IVK_SortingDelete").withParams(params).execute(context);
	}
	public static void iVK_SortingSave(IContext context, xlsreport.proxies.MxSorting _mxSorting)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxSorting", _mxSorting == null ? null : _mxSorting.getMendixObject());
		Core.microflowCall("XLSReport.IVK_SortingSave").withParams(params).execute(context);
	}
	public static void iVK_TemplateEdit(IContext context, xlsreport.proxies.MxTemplate _mxTemplate)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxTemplate", _mxTemplate == null ? null : _mxTemplate.getMendixObject());
		Core.microflowCall("XLSReport.IVK_TemplateEdit").withParams(params).execute(context);
	}
	public static void iVK_TemplateSaveAndNext(IContext context, xlsreport.proxies.MxTemplate _template)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Template", _template == null ? null : _template.getMendixObject());
		Core.microflowCall("XLSReport.IVK_TemplateSaveAndNext").withParams(params).execute(context);
	}
	public static void iVK_UploadExcistFile(IContext context, xlsreport.proxies.MxTemplate _mxTemplate)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxTemplate", _mxTemplate == null ? null : _mxTemplate.getMendixObject());
		Core.microflowCall("XLSReport.IVK_UploadExcistFile").withParams(params).execute(context);
	}
	public static void oCh_Sheet_Object(IContext context, xlsreport.proxies.MxSheet _mxSheet)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxSheet", _mxSheet == null ? null : _mxSheet.getMendixObject());
		Core.microflowCall("XLSReport.OCh_Sheet_Object").withParams(params).execute(context);
	}
	public static void oCh_Sheet_Reference(IContext context, xlsreport.proxies.MxSheet _mxSheet)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxSheet", _mxSheet == null ? null : _mxSheet.getMendixObject());
		Core.microflowCall("XLSReport.OCh_Sheet_Reference").withParams(params).execute(context);
	}
	public static void oCh_Template_Save(IContext context, xlsreport.proxies.MxTemplate _mxTemplate)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxTemplate", _mxTemplate == null ? null : _mxTemplate.getMendixObject());
		Core.microflowCall("XLSReport.OCh_Template_Save").withParams(params).execute(context);
	}
	public static void oCh_XPath_Refresh(IContext context, xlsreport.proxies.MxXPath _mxXPath)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxXPath", _mxXPath == null ? null : _mxXPath.getMendixObject());
		Core.microflowCall("XLSReport.OCh_XPath_Refresh").withParams(params).execute(context);
	}
	public static void oCh_Xpath_RetrieveType(IContext context, xlsreport.proxies.MxXPath _parentMxXPath)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ParentMxXPath", _parentMxXPath == null ? null : _parentMxXPath.getMendixObject());
		Core.microflowCall("XLSReport.OCh_Xpath_RetrieveType").withParams(params).execute(context);
	}
	public static void settings_Save(IContext context, xlsreport.proxies.MxColumnSettings _mxColumnSettings)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxColumnSettings", _mxColumnSettings == null ? null : _mxColumnSettings.getMendixObject());
		Core.microflowCall("XLSReport.Settings_Save").withParams(params).execute(context);
	}
	public static boolean sF_Column_Validate(IContext context, xlsreport.proxies.MxColumn _mxColumn, boolean _showMessage, xlsreport.proxies.MxSheet _mxSheet)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxColumn", _mxColumn == null ? null : _mxColumn.getMendixObject());
		params.put("ShowMessage", _showMessage);
		params.put("MxSheet", _mxSheet == null ? null : _mxSheet.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("XLSReport.SF_Column_Validate").withParams(params).execute(context);
	}
	public static mxmodelreflection.proxies.MxObjectMember sF_FindAttribute(IContext context, xlsreport.proxies.MxXPath _mxXPath)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxXPath", _mxXPath == null ? null : _mxXPath.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("XLSReport.SF_FindAttribute").withParams(params).execute(context);
		return result == null ? null : mxmodelreflection.proxies.MxObjectMember.initialize(context, result);
	}
	public static xlsreport.proxies.AttributeType sF_ParseDateType(IContext context, java.lang.String _dateTypeText)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("DateTypeText", _dateTypeText);
		java.lang.String result = (java.lang.String) Core.microflowCall("XLSReport.SF_ParseDateType").withParams(params).execute(context);
		return result == null ? null : xlsreport.proxies.AttributeType.valueOf(result);
	}
	public static boolean sF_Static_Validate(IContext context, xlsreport.proxies.MxStatic _mxStatic, boolean _showMessage)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxStatic", _mxStatic == null ? null : _mxStatic.getMendixObject());
		params.put("ShowMessage", _showMessage);
		return (java.lang.Boolean) Core.microflowCall("XLSReport.SF_Static_Validate").withParams(params).execute(context);
	}
	public static void sheet_Save(IContext context, xlsreport.proxies.MxSheet _mxSheet)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxSheet", _mxSheet == null ? null : _mxSheet.getMendixObject());
		Core.microflowCall("XLSReport.Sheet_Save").withParams(params).execute(context);
	}
	public static void static_New(IContext context, xlsreport.proxies.MxSheet _mxSheet)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxSheet", _mxSheet == null ? null : _mxSheet.getMendixObject());
		Core.microflowCall("XLSReport.Static_New").withParams(params).execute(context);
	}
	public static boolean static_Save(IContext context, xlsreport.proxies.MxStatic _mxStatic)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxStatic", _mxStatic == null ? null : _mxStatic.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("XLSReport.Static_Save").withParams(params).execute(context);
	}
	public static void xPath_Delete_Subs(IContext context, xlsreport.proxies.MxXPath _parentXPath)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ParentXPath", _parentXPath == null ? null : _parentXPath.getMendixObject());
		Core.microflowCall("XLSReport.XPath_Delete_Subs").withParams(params).execute(context);
	}
	public static void xPath_New(IContext context, xlsreport.proxies.MxData _mxData)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxData", _mxData == null ? null : _mxData.getMendixObject());
		Core.microflowCall("XLSReport.XPath_New").withParams(params).execute(context);
	}
	public static boolean xPath_Validate(IContext context, xlsreport.proxies.MxXPath _mxXPath, boolean _showMessage, java.util.List<xlsreport.proxies.MxReferenceHandling> _referenceHandlerList, xlsreport.proxies.MxSheet _mxSheet)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxXPath", _mxXPath == null ? null : _mxXPath.getMendixObject());
		params.put("ShowMessage", _showMessage);
		java.util.ArrayList<IMendixObject> listparam_referenceHandlerList = null;
		if (_referenceHandlerList != null)
		{
			listparam_referenceHandlerList = new java.util.ArrayList<>();
			for (xlsreport.proxies.MxReferenceHandling obj : _referenceHandlerList)
				listparam_referenceHandlerList.add(obj.getMendixObject());
		}
		params.put("ReferenceHandlerList", listparam_referenceHandlerList);

		params.put("MxSheet", _mxSheet == null ? null : _mxSheet.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("XLSReport.XPath_Validate").withParams(params).execute(context);
	}
}