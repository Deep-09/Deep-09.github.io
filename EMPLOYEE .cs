using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;
namespace Test
{
    #region EMPLOYEE
    public class EMPLOYEE
    {
        #region Member Variables
        protected int _EmpNo;
        protected string _Ename;
        protected string _Job;
        protected string _MGR;
        protected unknown _Hiredate;
        protected int _Salary;
        protected int _DeptNo;
        #endregion
        #region Constructors
        public EMPLOYEE() { }
        public EMPLOYEE(string Ename, string Job, string MGR, unknown Hiredate, int Salary, int DeptNo)
        {
            this._Ename=Ename;
            this._Job=Job;
            this._MGR=MGR;
            this._Hiredate=Hiredate;
            this._Salary=Salary;
            this._DeptNo=DeptNo;
        }
        #endregion
        #region Public Properties
        public virtual int EmpNo
        {
            get {return _EmpNo;}
            set {_EmpNo=value;}
        }
        public virtual string Ename
        {
            get {return _Ename;}
            set {_Ename=value;}
        }
        public virtual string Job
        {
            get {return _Job;}
            set {_Job=value;}
        }
        public virtual string MGR
        {
            get {return _MGR;}
            set {_MGR=value;}
        }
        public virtual unknown Hiredate
        {
            get {return _Hiredate;}
            set {_Hiredate=value;}
        }
        public virtual int Salary
        {
            get {return _Salary;}
            set {_Salary=value;}
        }
        public virtual int DeptNo
        {
            get {return _DeptNo;}
            set {_DeptNo=value;}
        }
        #endregion
    }
    #endregion
}