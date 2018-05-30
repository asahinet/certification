package org.sakaiproject.certification.impl.hibernate;

import org.sakaiproject.certification.api.BaseCertificateDefinition;

/**
 * User: duffy
 * Date: Jun 27, 2011
 * Time: 2:23:02 PM
 */
public class CertificateDefinitionHibernateImpl extends BaseCertificateDefinition
{

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (!(o instanceof CertificateDefinitionHibernateImpl))
        {
            return false;
        }

        CertificateDefinitionHibernateImpl that = (CertificateDefinitionHibernateImpl) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode()
    {
        return id.hashCode();
    }
}