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
 * OAIMessageObject_content_inner.h
 *
 * 
 */

#ifndef OAIMessageObject_content_inner_H
#define OAIMessageObject_content_inner_H

#include <QJsonObject>

#include "OAIMessageContentImageFileObject.h"
#include "OAIMessageContentImageFileObject_image_file.h"
#include "OAIMessageContentTextObject.h"
#include "OAIMessageContentTextObject_text.h"
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAIMessageContentImageFileObject_image_file;
class OAIMessageContentTextObject_text;

class OAIMessageObject_content_inner : public OAIObject {
public:
    OAIMessageObject_content_inner();
    OAIMessageObject_content_inner(QString json);
    ~OAIMessageObject_content_inner() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getType() const;
    void setType(const QString &type);
    bool is_type_Set() const;
    bool is_type_Valid() const;

    OAIMessageContentImageFileObject_image_file getImageFile() const;
    void setImageFile(const OAIMessageContentImageFileObject_image_file &image_file);
    bool is_image_file_Set() const;
    bool is_image_file_Valid() const;

    OAIMessageContentTextObject_text getText() const;
    void setText(const OAIMessageContentTextObject_text &text);
    bool is_text_Set() const;
    bool is_text_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString m_type;
    bool m_type_isSet;
    bool m_type_isValid;

    OAIMessageContentImageFileObject_image_file m_image_file;
    bool m_image_file_isSet;
    bool m_image_file_isValid;

    OAIMessageContentTextObject_text m_text;
    bool m_text_isSet;
    bool m_text_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIMessageObject_content_inner)

#endif // OAIMessageObject_content_inner_H
