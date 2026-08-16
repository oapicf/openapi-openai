
/*
 * RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error.h
 *
 * Details of the transcription error.
 */

#ifndef TINY_CPP_CLIENT_RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error_H_
#define TINY_CPP_CLIENT_RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Details of the transcription error.
 *
 *  \ingroup Models
 *
 */

class RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error{
public:

    /*! \brief Constructor.
	 */
    RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error();
    RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The type of error.
	 */
	std::string getType();

	/*! \brief Set The type of error.
	 */
	void setType(std::string  type);
	/*! \brief Get Error code, if any.
	 */
	std::string getCode();

	/*! \brief Set Error code, if any.
	 */
	void setCode(std::string  code);
	/*! \brief Get A human-readable error message.
	 */
	std::string getMessage();

	/*! \brief Set A human-readable error message.
	 */
	void setMessage(std::string  message);
	/*! \brief Get Parameter related to the error, if any.
	 */
	std::string getParam();

	/*! \brief Set Parameter related to the error, if any.
	 */
	void setParam(std::string  param);


    private:
    std::string type{};
    std::string code{};
    std::string message{};
    std::string param{};
};
}

#endif /* TINY_CPP_CLIENT_RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error_H_ */
