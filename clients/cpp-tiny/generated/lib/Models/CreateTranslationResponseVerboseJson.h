
/*
 * CreateTranslationResponseVerboseJson.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CreateTranslationResponseVerboseJson_H_
#define TINY_CPP_CLIENT_CreateTranslationResponseVerboseJson_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "TranscriptionSegment.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CreateTranslationResponseVerboseJson{
public:

    /*! \brief Constructor.
	 */
    CreateTranslationResponseVerboseJson();
    CreateTranslationResponseVerboseJson(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateTranslationResponseVerboseJson();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The language of the output translation (always `english`).
	 */
	std::string getLanguage();

	/*! \brief Set The language of the output translation (always `english`).
	 */
	void setLanguage(std::string  language);
	/*! \brief Get The duration of the input audio.
	 */
	std::string getDuration();

	/*! \brief Set The duration of the input audio.
	 */
	void setDuration(std::string  duration);
	/*! \brief Get The translated text.
	 */
	std::string getText();

	/*! \brief Set The translated text.
	 */
	void setText(std::string  text);
	/*! \brief Get Segments of the translated text and their corresponding details.
	 */
	std::list<TranscriptionSegment> getSegments();

	/*! \brief Set Segments of the translated text and their corresponding details.
	 */
	void setSegments(std::list <TranscriptionSegment> segments);


    private:
    std::string language{};
    std::string duration{};
    std::string text{};
    std::list<TranscriptionSegment> segments;
};
}

#endif /* TINY_CPP_CLIENT_CreateTranslationResponseVerboseJson_H_ */
