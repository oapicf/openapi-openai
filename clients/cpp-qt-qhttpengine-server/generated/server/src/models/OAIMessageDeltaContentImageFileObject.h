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
 * OAIMessageDeltaContentImageFileObject.h
 *
 * References an image [File](/docs/api-reference/files) in the content of a message.
 */

#ifndef OAIMessageDeltaContentImageFileObject_H
#define OAIMessageDeltaContentImageFileObject_H

#include <QJsonObject>

#include "OAIMessageDeltaContentImageFileObject_image_file.h"
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIMessageDeltaContentImageFileObject : public OAIObject {
public:
    OAIMessageDeltaContentImageFileObject();
    OAIMessageDeltaContentImageFileObject(QString json);
    ~OAIMessageDeltaContentImageFileObject() override;

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
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIMessageDeltaContentImageFileObject)

#endif // OAIMessageDeltaContentImageFileObject_H
