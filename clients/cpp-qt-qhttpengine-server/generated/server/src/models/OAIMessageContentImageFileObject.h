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
 * OAIMessageContentImageFileObject.h
 *
 * References an image [File](/docs/api-reference/files) in the content of a message.
 */

#ifndef OAIMessageContentImageFileObject_H
#define OAIMessageContentImageFileObject_H

#include <QJsonObject>

#include "OAIMessageContentImageFileObject_image_file.h"
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIMessageContentImageFileObject : public OAIObject {
public:
    OAIMessageContentImageFileObject();
    OAIMessageContentImageFileObject(QString json);
    ~OAIMessageContentImageFileObject() override;

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

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString type;
    bool m_type_isSet;
    bool m_type_isValid;

    OAIMessageContentImageFileObject_image_file image_file;
    bool m_image_file_isSet;
    bool m_image_file_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIMessageContentImageFileObject)

#endif // OAIMessageContentImageFileObject_H
