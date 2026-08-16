
/*
 * AudioResponseFormat.h
 *
 * The format of the output, in one of these options: &#x60;json&#x60;, &#x60;text&#x60;, &#x60;srt&#x60;, &#x60;verbose_json&#x60;, or &#x60;vtt&#x60;. 
 */

#ifndef TINY_CPP_CLIENT_AudioResponseFormat_H_
#define TINY_CPP_CLIENT_AudioResponseFormat_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The format of the output, in one of these options: `json`, `text`, `srt`, `verbose_json`, or `vtt`. 
 *
 *  \ingroup Models
 *
 */

class AudioResponseFormat{
public:

    /*! \brief Constructor.
	 */
    AudioResponseFormat();
    AudioResponseFormat(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AudioResponseFormat();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_AudioResponseFormat_H_ */
