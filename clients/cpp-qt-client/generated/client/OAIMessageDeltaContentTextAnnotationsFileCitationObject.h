/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * OAIMessageDeltaContentTextAnnotationsFileCitationObject.h
 *
 * A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \&quot;retrieval\&quot; tool to search files.
 */

#ifndef OAIMessageDeltaContentTextAnnotationsFileCitationObject_H
#define OAIMessageDeltaContentTextAnnotationsFileCitationObject_H

#include <QJsonObject>

#include "OAIMessageDeltaContentTextAnnotationsFileCitationObject_file_citation.h"
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAIMessageDeltaContentTextAnnotationsFileCitationObject_file_citation;

class OAIMessageDeltaContentTextAnnotationsFileCitationObject : public OAIObject {
public:
    OAIMessageDeltaContentTextAnnotationsFileCitationObject();
    OAIMessageDeltaContentTextAnnotationsFileCitationObject(QString json);
    ~OAIMessageDeltaContentTextAnnotationsFileCitationObject() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    qint32 getIndex() const;
    void setIndex(const qint32 &index);
    bool is_index_Set() const;
    bool is_index_Valid() const;

    QString getType() const;
    void setType(const QString &type);
    bool is_type_Set() const;
    bool is_type_Valid() const;

    QString getText() const;
    void setText(const QString &text);
    bool is_text_Set() const;
    bool is_text_Valid() const;

    OAIMessageDeltaContentTextAnnotationsFileCitationObject_file_citation getFileCitation() const;
    void setFileCitation(const OAIMessageDeltaContentTextAnnotationsFileCitationObject_file_citation &file_citation);
    bool is_file_citation_Set() const;
    bool is_file_citation_Valid() const;

    qint32 getStartIndex() const;
    void setStartIndex(const qint32 &start_index);
    bool is_start_index_Set() const;
    bool is_start_index_Valid() const;

    qint32 getEndIndex() const;
    void setEndIndex(const qint32 &end_index);
    bool is_end_index_Set() const;
    bool is_end_index_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    qint32 m_index;
    bool m_index_isSet;
    bool m_index_isValid;

    QString m_type;
    bool m_type_isSet;
    bool m_type_isValid;

    QString m_text;
    bool m_text_isSet;
    bool m_text_isValid;

    OAIMessageDeltaContentTextAnnotationsFileCitationObject_file_citation m_file_citation;
    bool m_file_citation_isSet;
    bool m_file_citation_isValid;

    qint32 m_start_index;
    bool m_start_index_isSet;
    bool m_start_index_isValid;

    qint32 m_end_index;
    bool m_end_index_isSet;
    bool m_end_index_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIMessageDeltaContentTextAnnotationsFileCitationObject)

#endif // OAIMessageDeltaContentTextAnnotationsFileCitationObject_H