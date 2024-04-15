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

#ifndef OAI_OAIFilesApi_H
#define OAI_OAIFilesApi_H

#include "OAIHelpers.h"
#include "OAIHttpRequest.h"
#include "OAIServerConfiguration.h"
#include "OAIOauth.h"

#include "OAIDeleteFileResponse.h"
#include "OAIHttpFileElement.h"
#include "OAIListFilesResponse.h"
#include "OAIOpenAIFile.h"
#include <QString>

#include <QObject>
#include <QByteArray>
#include <QStringList>
#include <QList>
#include <QNetworkAccessManager>

namespace OpenAPI {

class OAIFilesApi : public QObject {
    Q_OBJECT

public:
    OAIFilesApi(const int timeOut = 0);
    ~OAIFilesApi();

    void initializeServerConfigs();
    int setDefaultServerValue(int serverIndex,const QString &operation, const QString &variable,const QString &val);
    void setServerIndex(const QString &operation, int serverIndex);
    void setApiKey(const QString &apiKeyName, const QString &apiKey);
    void setBearerToken(const QString &token);
    void setUsername(const QString &username);
    void setPassword(const QString &password);
    void setTimeOut(const int timeOut);
    void setWorkingDirectory(const QString &path);
    void setNetworkAccessManager(QNetworkAccessManager* manager);
    int addServerConfiguration(const QString &operation, const QUrl &url, const QString &description = "", const QMap<QString, OAIServerVariable> &variables = QMap<QString, OAIServerVariable>());
    void setNewServerForAllOperations(const QUrl &url, const QString &description = "", const QMap<QString, OAIServerVariable> &variables =  QMap<QString, OAIServerVariable>());
    void setNewServer(const QString &operation, const QUrl &url, const QString &description = "", const QMap<QString, OAIServerVariable> &variables =  QMap<QString, OAIServerVariable>());
    void addHeaders(const QString &key, const QString &value);
    void enableRequestCompression();
    void enableResponseCompression();
    void abortRequests();
    QString getParamStylePrefix(const QString &style);
    QString getParamStyleSuffix(const QString &style);
    QString getParamStyleDelimiter(const QString &style, const QString &name, bool isExplode);

    /**
    * @param[in]  file OAIHttpFileElement [required]
    * @param[in]  purpose QString [required]
    */
    void createFile(const OAIHttpFileElement &file, const QString &purpose);

    /**
    * @param[in]  file_id QString [required]
    */
    void deleteFile(const QString &file_id);

    /**
    * @param[in]  file_id QString [required]
    */
    void downloadFile(const QString &file_id);

    /**
    * @param[in]  purpose QString [optional]
    */
    void listFiles(const ::OpenAPI::OptionalParam<QString> &purpose = ::OpenAPI::OptionalParam<QString>());

    /**
    * @param[in]  file_id QString [required]
    */
    void retrieveFile(const QString &file_id);


private:
    QMap<QString,int> _serverIndices;
    QMap<QString,QList<OAIServerConfiguration>> _serverConfigs;
    QMap<QString, QString> _apiKeys;
    QString _bearerToken;
    QString _username;
    QString _password;
    int _timeOut;
    QString _workingDirectory;
    QNetworkAccessManager* _manager;
    QMap<QString, QString> _defaultHeaders;
    bool _isResponseCompressionEnabled;
    bool _isRequestCompressionEnabled;
    OAIHttpRequestInput _latestInput;
    OAIHttpRequestWorker *_latestWorker;
    QStringList _latestScope;
    OauthCode _authFlow;
    OauthImplicit _implicitFlow;
    OauthCredentials _credentialFlow;
    OauthPassword _passwordFlow;
    int _OauthMethod = 0;

    void createFileCallback(OAIHttpRequestWorker *worker);
    void deleteFileCallback(OAIHttpRequestWorker *worker);
    void downloadFileCallback(OAIHttpRequestWorker *worker);
    void listFilesCallback(OAIHttpRequestWorker *worker);
    void retrieveFileCallback(OAIHttpRequestWorker *worker);

Q_SIGNALS:

    void createFileSignal(OAIOpenAIFile summary);
    void deleteFileSignal(OAIDeleteFileResponse summary);
    void downloadFileSignal(QString summary);
    void listFilesSignal(OAIListFilesResponse summary);
    void retrieveFileSignal(OAIOpenAIFile summary);

    void createFileSignalFull(OAIHttpRequestWorker *worker, OAIOpenAIFile summary);
    void deleteFileSignalFull(OAIHttpRequestWorker *worker, OAIDeleteFileResponse summary);
    void downloadFileSignalFull(OAIHttpRequestWorker *worker, QString summary);
    void listFilesSignalFull(OAIHttpRequestWorker *worker, OAIListFilesResponse summary);
    void retrieveFileSignalFull(OAIHttpRequestWorker *worker, OAIOpenAIFile summary);

    Q_DECL_DEPRECATED_X("Use createFileSignalError() instead")
    void createFileSignalE(OAIOpenAIFile summary, QNetworkReply::NetworkError error_type, QString error_str);
    void createFileSignalError(OAIOpenAIFile summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use deleteFileSignalError() instead")
    void deleteFileSignalE(OAIDeleteFileResponse summary, QNetworkReply::NetworkError error_type, QString error_str);
    void deleteFileSignalError(OAIDeleteFileResponse summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use downloadFileSignalError() instead")
    void downloadFileSignalE(QString summary, QNetworkReply::NetworkError error_type, QString error_str);
    void downloadFileSignalError(QString summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use listFilesSignalError() instead")
    void listFilesSignalE(OAIListFilesResponse summary, QNetworkReply::NetworkError error_type, QString error_str);
    void listFilesSignalError(OAIListFilesResponse summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use retrieveFileSignalError() instead")
    void retrieveFileSignalE(OAIOpenAIFile summary, QNetworkReply::NetworkError error_type, QString error_str);
    void retrieveFileSignalError(OAIOpenAIFile summary, QNetworkReply::NetworkError error_type, const QString &error_str);

    Q_DECL_DEPRECATED_X("Use createFileSignalErrorFull() instead")
    void createFileSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void createFileSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use deleteFileSignalErrorFull() instead")
    void deleteFileSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void deleteFileSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use downloadFileSignalErrorFull() instead")
    void downloadFileSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void downloadFileSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use listFilesSignalErrorFull() instead")
    void listFilesSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void listFilesSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use retrieveFileSignalErrorFull() instead")
    void retrieveFileSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void retrieveFileSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);

    void abortRequestsSignal();
    void allPendingRequestsCompleted();

public Q_SLOTS:
    void tokenAvailable();
};

} // namespace OpenAPI
#endif