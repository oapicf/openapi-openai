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

#ifndef OAI_OAIFilesApiHandler_H
#define OAI_OAIFilesApiHandler_H

#include <QObject>

#include "OAIDeleteFileResponse.h"
#include "OAIHttpFileElement.h"
#include "OAIListFilesResponse.h"
#include "OAIOpenAIFile.h"
#include <QString>

namespace OpenAPI {

class OAIFilesApiHandler : public QObject
{
    Q_OBJECT

public:
    OAIFilesApiHandler();
    virtual ~OAIFilesApiHandler();


public Q_SLOTS:
    virtual void createFile(OAIHttpFileElement file, QString purpose);
    virtual void deleteFile(QString file_id);
    virtual void downloadFile(QString file_id);
    virtual void listFiles(QString purpose);
    virtual void retrieveFile(QString file_id);
    

};

}

#endif // OAI_OAIFilesApiHandler_H
