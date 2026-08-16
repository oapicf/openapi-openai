
/*
 * CreateModerationResponse_results_inner_category_scores.h
 *
 * A list of the categories along with their scores as predicted by model.
 */

#ifndef TINY_CPP_CLIENT_CreateModerationResponse_results_inner_category_scores_H_
#define TINY_CPP_CLIENT_CreateModerationResponse_results_inner_category_scores_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief A list of the categories along with their scores as predicted by model.
 *
 *  \ingroup Models
 *
 */

class CreateModerationResponse_results_inner_category_scores{
public:

    /*! \brief Constructor.
	 */
    CreateModerationResponse_results_inner_category_scores();
    CreateModerationResponse_results_inner_category_scores(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateModerationResponse_results_inner_category_scores();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The score for the category 'hate'.
	 */
	long getHate();

	/*! \brief Set The score for the category 'hate'.
	 */
	void setHate(long  hate);
	/*! \brief Get The score for the category 'hate/threatening'.
	 */
	long getHatethreatening();

	/*! \brief Set The score for the category 'hate/threatening'.
	 */
	void setHatethreatening(long  hatethreatening);
	/*! \brief Get The score for the category 'harassment'.
	 */
	long getHarassment();

	/*! \brief Set The score for the category 'harassment'.
	 */
	void setHarassment(long  harassment);
	/*! \brief Get The score for the category 'harassment/threatening'.
	 */
	long getHarassmentthreatening();

	/*! \brief Set The score for the category 'harassment/threatening'.
	 */
	void setHarassmentthreatening(long  harassmentthreatening);
	/*! \brief Get The score for the category 'illicit'.
	 */
	long getIllicit();

	/*! \brief Set The score for the category 'illicit'.
	 */
	void setIllicit(long  illicit);
	/*! \brief Get The score for the category 'illicit/violent'.
	 */
	long getIllicitviolent();

	/*! \brief Set The score for the category 'illicit/violent'.
	 */
	void setIllicitviolent(long  illicitviolent);
	/*! \brief Get The score for the category 'self-harm'.
	 */
	long getSelfharm();

	/*! \brief Set The score for the category 'self-harm'.
	 */
	void setSelfharm(long  selfharm);
	/*! \brief Get The score for the category 'self-harm/intent'.
	 */
	long getSelfharmintent();

	/*! \brief Set The score for the category 'self-harm/intent'.
	 */
	void setSelfharmintent(long  selfharmintent);
	/*! \brief Get The score for the category 'self-harm/instructions'.
	 */
	long getSelfharminstructions();

	/*! \brief Set The score for the category 'self-harm/instructions'.
	 */
	void setSelfharminstructions(long  selfharminstructions);
	/*! \brief Get The score for the category 'sexual'.
	 */
	long getSexual();

	/*! \brief Set The score for the category 'sexual'.
	 */
	void setSexual(long  sexual);
	/*! \brief Get The score for the category 'sexual/minors'.
	 */
	long getSexualminors();

	/*! \brief Set The score for the category 'sexual/minors'.
	 */
	void setSexualminors(long  sexualminors);
	/*! \brief Get The score for the category 'violence'.
	 */
	long getViolence();

	/*! \brief Set The score for the category 'violence'.
	 */
	void setViolence(long  violence);
	/*! \brief Get The score for the category 'violence/graphic'.
	 */
	long getViolencegraphic();

	/*! \brief Set The score for the category 'violence/graphic'.
	 */
	void setViolencegraphic(long  violencegraphic);


    private:
    long hate{};
    long hatethreatening{};
    long harassment{};
    long harassmentthreatening{};
    long illicit{};
    long illicitviolent{};
    long selfharm{};
    long selfharmintent{};
    long selfharminstructions{};
    long sexual{};
    long sexualminors{};
    long violence{};
    long violencegraphic{};
};
}

#endif /* TINY_CPP_CLIENT_CreateModerationResponse_results_inner_category_scores_H_ */
