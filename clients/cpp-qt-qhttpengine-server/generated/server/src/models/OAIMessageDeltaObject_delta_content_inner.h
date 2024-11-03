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
 * OAIMessageDeltaObject_delta_content_inner.h
 *
 * 
 */

#ifndef OAIMessageDeltaObject_delta_content_inner_H
#define OAIMessageDeltaObject_delta_content_inner_H

#include <QJsonObject>

#include "OAIMessageDeltaContentImageFileObject.h"
#include "OAIMessageDeltaContentImageFileObject_image_file.h"
#include "OAIMessageDeltaContentTextObject.h"
#include "OAIMessageDeltaContentTextObject_text.h"
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIMessageDeltaObject_delta_content_inner : public OAIObject {
public:
    OAIMessageDeltaObject_delta_content_inner();
    OAIMessageDeltaObject_delta_content_inner(QString json);
    ~OAIMessageDeltaObject_delta_content_inner() override;

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

    OAIMessageDeltaContentImageFileObject_image_file getImageFile() const;
    void setImageFile(const OAIMessageDeltaContentImageFileObject_image_file &image_file);
    bool is_image_file_Set() const;
    bool is_image_file_Valid() const;

    OAIMessageDeltaContentTextObject_text getText() const;
    void setText(const OAIMessageDeltaContentTextObject_text &text);
    bool is_text_Set() const;
    bool is_text_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    qint32 index;
    bool m_index_isSet;
    bool m_index_isValid;

    QString type;
    bool m_type_isSet;
    bool m_type_isValid;

    OAIMessageDeltaContentImageFileObject_image_file image_file;
    bool m_image_file_isSet;
    bool m_image_file_isValid;

    OAIMessageDeltaContentTextObject_text text;
    bool m_text_isSet;
    bool m_text_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIMessageDeltaObject_delta_content_inner)

#endif // OAIMessageDeltaObject_delta_content_inner_H
