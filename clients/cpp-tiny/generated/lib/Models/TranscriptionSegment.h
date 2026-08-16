
/*
 * TranscriptionSegment.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_TranscriptionSegment_H_
#define TINY_CPP_CLIENT_TranscriptionSegment_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class TranscriptionSegment{
public:

    /*! \brief Constructor.
	 */
    TranscriptionSegment();
    TranscriptionSegment(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TranscriptionSegment();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Unique identifier of the segment.
	 */
	int getId();

	/*! \brief Set Unique identifier of the segment.
	 */
	void setId(int  id);
	/*! \brief Get Seek offset of the segment.
	 */
	int getSeek();

	/*! \brief Set Seek offset of the segment.
	 */
	void setSeek(int  seek);
	/*! \brief Get Start time of the segment in seconds.
	 */
	float getStart();

	/*! \brief Set Start time of the segment in seconds.
	 */
	void setStart(float  start);
	/*! \brief Get End time of the segment in seconds.
	 */
	float getEnd();

	/*! \brief Set End time of the segment in seconds.
	 */
	void setEnd(float  end);
	/*! \brief Get Text content of the segment.
	 */
	std::string getText();

	/*! \brief Set Text content of the segment.
	 */
	void setText(std::string  text);
	/*! \brief Get Array of token IDs for the text content.
	 */
	std::list<int> getTokens();

	/*! \brief Set Array of token IDs for the text content.
	 */
	void setTokens(std::list <int> tokens);
	/*! \brief Get Temperature parameter used for generating the segment.
	 */
	float getTemperature();

	/*! \brief Set Temperature parameter used for generating the segment.
	 */
	void setTemperature(float  temperature);
	/*! \brief Get Average logprob of the segment. If the value is lower than -1, consider the logprobs failed.
	 */
	float getAvgLogprob();

	/*! \brief Set Average logprob of the segment. If the value is lower than -1, consider the logprobs failed.
	 */
	void setAvgLogprob(float  avg_logprob);
	/*! \brief Get Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed.
	 */
	float getCompressionRatio();

	/*! \brief Set Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed.
	 */
	void setCompressionRatio(float  compression_ratio);
	/*! \brief Get Probability of no speech in the segment. If the value is higher than 1.0 and the `avg_logprob` is below -1, consider this segment silent.
	 */
	float getNoSpeechProb();

	/*! \brief Set Probability of no speech in the segment. If the value is higher than 1.0 and the `avg_logprob` is below -1, consider this segment silent.
	 */
	void setNoSpeechProb(float  no_speech_prob);


    private:
    int id{};
    int seek{};
    float start{};
    float end{};
    std::string text{};
    std::list<int> tokens;
    float temperature{};
    float avg_logprob{};
    float compression_ratio{};
    float no_speech_prob{};
};
}

#endif /* TINY_CPP_CLIENT_TranscriptionSegment_H_ */
