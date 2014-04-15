
package org.nameapi.client.services.nameparser;

import com.google.common.base.Optional;
import crema.annotation.Immutable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.nameapi.client.services.nameparser.wsdl.SoapMatch;

import java.util.List;


/**
 */
@Immutable
public class NameParserResult {

    @NotNull
    private final Optional<Match> bestMatch;
    @NotNull
    private final List<Match> matches;
    private final int shortestItemCount;

    public NameParserResult(@Nullable SoapMatch bestMatch, @NotNull List<SoapMatch> matches, int shortestItemCount) {
        this.bestMatch = Optional.fromNullable(Conversion.convert(bestMatch));
        this.matches = Conversion.convertMatches(matches);
        this.shortestItemCount = shortestItemCount;
    }

    @NotNull
    public Optional<Match> getBestMatch() {
        return bestMatch;
    }

    @NotNull
    public List<Match> getMatches() {
        return matches;
    }

    public int getShortestItemCount() {
        return shortestItemCount;
    }


    @Override
    public String toString() {
        return "ParserResult{" +
                "bestMatch=" + bestMatch +
                ", matches=" + matches +
                ", shortestItemCount=" + shortestItemCount +
                '}';
    }
}