
/*
 * RealtimeServerEventResponseContentPartDone_part.h
 *
 * The content part that is done.
 */

#ifndef TINY_CPP_CLIENT_RealtimeServerEventResponseContentPartDone_part_H_
#define TINY_CPP_CLIENT_RealtimeServerEventResponseContentPartDone_part_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The content part that is done.
 *
 *  \ingroup Models
 *
 */

class RealtimeServerEventResponseContentPartDone_part{
public:

    /*! \brief Constructor.
	 */
    RealtimeServerEventResponseContentPartDone_part();
    RealtimeServerEventResponseContentPartDone_part(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RealtimeServerEventResponseContentPartDone_part();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The content type (\"text\", \"audio\").
	 */
	std::string getType();

	/*! \brief Set The content type (\"text\", \"audio\").
	 */
	void setType(std::string  type);
	/*! \brief Get The text content (if type is \"text\").
	 */
	std::string getText();

	/*! \brief Set The text content (if type is \"text\").
	 */
	void setText(std::string  text);
	/*! \brief Get Base64-encoded audio data (if type is \"audio\").
	 */
	std::string getAudio();

	/*! \brief Set Base64-encoded audio data (if type is \"audio\").
	 */
	void setAudio(std::string  audio);
	/*! \brief Get The transcript of the audio (if type is \"audio\").
	 */
	std::string getTranscript();

	/*! \brief Set The transcript of the audio (if type is \"audio\").
	 */
	void setTranscript(std::string  transcript);


    private:
    std::string type{};
    std::string text{};
    std::string audio{};
    std::string transcript{};
};
}

#endif /* TINY_CPP_CLIENT_RealtimeServerEventResponseContentPartDone_part_H_ */
