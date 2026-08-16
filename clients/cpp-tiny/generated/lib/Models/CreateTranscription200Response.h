
/*
 * CreateTranscription_200_response.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CreateTranscription_200_response_H_
#define TINY_CPP_CLIENT_CreateTranscription_200_response_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CreateTranscriptionResponseJson.h"
#include "CreateTranscriptionResponseVerboseJson.h"
#include "TranscriptionSegment.h"
#include "TranscriptionWord.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CreateTranscription_200_response{
public:

    /*! \brief Constructor.
	 */
    CreateTranscription_200_response();
    CreateTranscription_200_response(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateTranscription_200_response();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The transcribed text.
	 */
	std::string getText();

	/*! \brief Set The transcribed text.
	 */
	void setText(std::string  text);
	/*! \brief Get The language of the input audio.
	 */
	std::string getLanguage();

	/*! \brief Set The language of the input audio.
	 */
	void setLanguage(std::string  language);
	/*! \brief Get The duration of the input audio.
	 */
	std::string getDuration();

	/*! \brief Set The duration of the input audio.
	 */
	void setDuration(std::string  duration);
	/*! \brief Get Extracted words and their corresponding timestamps.
	 */
	std::list<TranscriptionWord> getWords();

	/*! \brief Set Extracted words and their corresponding timestamps.
	 */
	void setWords(std::list <TranscriptionWord> words);
	/*! \brief Get Segments of the transcribed text and their corresponding details.
	 */
	std::list<TranscriptionSegment> getSegments();

	/*! \brief Set Segments of the transcribed text and their corresponding details.
	 */
	void setSegments(std::list <TranscriptionSegment> segments);


    private:
    std::string text{};
    std::string language{};
    std::string duration{};
    std::list<TranscriptionWord> words;
    std::list<TranscriptionSegment> segments;
};
}

#endif /* TINY_CPP_CLIENT_CreateTranscription_200_response_H_ */
